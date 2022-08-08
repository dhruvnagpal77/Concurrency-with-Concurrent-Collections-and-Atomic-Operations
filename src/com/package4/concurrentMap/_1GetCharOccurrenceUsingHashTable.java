package com.package4.concurrentMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class _1GetCharOccurrenceUsingHashTable {
    public static void main(String[] args) {
        Map<Character, LongAdder> occurrences = new Hashtable<>(); // Used Hashtable coz its thread safe
        String str = "ABCD ABCD ABCD";

        for(Character character: str.toCharArray()) {
            LongAdder longAdder = occurrences.get(character);
            if(longAdder == null) {
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurrences.put(character, longAdder);
        }

        System.out.println(occurrences);
    }
}
// Here even though the Hashtable itself is thread-safe, out entire logic inside for-loop is not,
// one thread can read the value & before this thread increments the value some other thread also reads the value, now one increment/operation is lost.
// To resolve this we will use ConcurrentHashMap next.