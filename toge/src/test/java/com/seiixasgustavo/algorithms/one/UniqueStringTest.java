package com.seiixasgustavo.algorithms.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueStringTest {

    @Test
    public void uniqueStringTest() {
        assertEquals(UniqueString.isUniqueWithDS("fdajslfadjklfa;lk"), false);
        assertEquals(UniqueString.isUniqueWithDS("asdgfbc,kl0984"), true);

        assertEquals(UniqueString.isUniqueWithoutDS("fdajslfadjklfa;lk"), false);
        assertEquals(UniqueString.isUniqueWithoutDS("asdgfbc,kl0984"), true);
    }
}
