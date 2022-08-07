package com.package1.Synchronized;

public class _1BiCounter {
    private int i = 0;
    private int j = 0;

    synchronized public void incrementI() {
        i++; // i++ is not an atomic operation, it consists of following
        // get i
        // increment i
        // set i
        // Therefore incrementing 'i' is not a thread safe operation,
        // meaning if multiple threads uses incrementI method at the same time, some updates might get lost,
        // therefore we use synchronised keyword so only one thread can be executing all the synchronized code on an instance.
    }

    synchronized public void incrementJ() {
        j++;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
// Using synchronized keyword allow only one thread to access either incrementI, incrementJ even though they are unrelated to each other. We will solve this will Lock next.