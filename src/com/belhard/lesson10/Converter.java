package com.belhard.lesson10;
@FunctionalInterface
public interface Converter<T,M> {
    T convert (M el);

}