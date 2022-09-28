package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public <T> ArrayList<T> newArrayList() {
        return new ArrayList<T>();
    }

    public <T> HashSet<T> newHashSet() {
        return new HashSet<T>();
    }

    public <K, T> HashMap<K, T> newHashMap() {
        return new HashMap<K, T>();
    }
}
