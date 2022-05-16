package com.belhard.lesson10.util;

@FunctionalInterface
public interface Converter<T,M> {
    T convert (M el);

}