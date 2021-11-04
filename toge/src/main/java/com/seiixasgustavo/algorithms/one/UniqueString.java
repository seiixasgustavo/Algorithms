package com.seiixasgustavo.algorithms.one;

import java.util.Arrays;
import java.util.HashMap;

public class UniqueString {
    public static Boolean isUniqueWithDS(final String str) {
        final HashMap<Character, Boolean> memo = new HashMap<>();

        for(final Character c : str.toCharArray()) {
            if (memo.get(c) != null) return false;
            memo.put(c, true);
        }

        return true;
    }

    public static Boolean isUniqueWithoutDS(final String str) {
        char[] ca = str.toCharArray();
        Arrays.sort(ca);

        for(int i = 0; i < ca.length-1; i++) {
            if (ca[i] == ca[i+1]) return false;
        }

        return true;
    }
}
