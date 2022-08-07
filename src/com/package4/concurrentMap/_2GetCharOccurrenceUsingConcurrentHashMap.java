package com.package4.concurrentMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class _2GetCharOccurrenceUsingConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();
        String str = "ABCD ABCD ABCD";

        for(Character character: str.toCharArray()) {
            // ConcurrentHashMap made all operations which involves multiple steps into atomic operations,
            // now this entire logic is thread-safe.
            occurrences.computeIfAbsent(character, key -> new LongAdder()).increment();
        }

        System.out.println(occurrences);
    }
}