package com.seiixasgustavo.algorithms.one;

public class Tester {
    public static void main(String[] args) {
        System.out.println(UniqueString.isUniqueWithDS("dasdsadasdsasda"));
        System.out.println(UniqueString.isUniqueWithDS("a"));
        System.out.println(UniqueString.isUniqueWithDS("aa"));
        System.out.println(UniqueString.isUniqueWithDS("abcdefghijklmnop"));

        System.out.println();

        System.out.println(UniqueString.isUniqueWithoutDS("dasdsadasdsasda"));
        System.out.println(UniqueString.isUniqueWithoutDS("a"));
        System.out.println(UniqueString.isUniqueWithoutDS("aa"));
        System.out.println(UniqueString.isUniqueWithoutDS("abcdefghijklmnop"));
    }
}
