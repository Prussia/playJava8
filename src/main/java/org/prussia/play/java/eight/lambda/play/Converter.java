package org.prussia.play.java.eight.lambda.play;
/*
 *  @FunctionalInterface can be omitted
 */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
