# playJava8
- http://winterbe.com/posts/2014/03/16/java-8-tutorial/
- http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/

## Lambda Expression
```java
List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
Collections.sort(names, (String a, String b) -> {
	return b.compareTo(a);
});
```

## Functional Interfaces

Example:

```java
@FunctionalInterface // can be ommited
interface Converter<F, T> {
    T convert(F from);
}
```

```java
Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
Integer converted = converter.convert("123");
System.out.println(converted);    // 123
```
## Method and Constructor References
The above example code can be further simplified by utilizing static method references
```java
Converter<String, Integer> converter = Integer::valueOf;
Integer converted = converter.convert("123");
System.out.println(converted);   // 123
```
### pass references of methods or constructors via the :: keyword
```java
class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
```

```java
Something something = new Something();
Converter<String, String> converter = something::startsWith;
String converted = converter.convert("Java");
System.out.println(converted);    // "J"
```

## java.util.stream
    A stream represents a sequence of values, and exposes a set of aggregate operations that allow us to express common manipulations on those values easily and clearly. The libraries provide convenient ways to obtain stream views of collections, arrays, and other data sources.
