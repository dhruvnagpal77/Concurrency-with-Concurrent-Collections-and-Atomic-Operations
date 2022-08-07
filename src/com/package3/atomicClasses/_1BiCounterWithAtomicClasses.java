package com.package3.atomicClasses;

import java.util.concurrent.atomic.AtomicInteger;

public class _1BiCounterWithAtomicClasses {
    private AtomicInteger i = new AtomicInteger(0); // Atomic classes provides basic atomic operations.
    private AtomicInteger j = new AtomicInteger(0);


    public void incrementI() {
        i.incrementAndGet(); // Atomically increments the current value, it makes sure that this piece of code is automatically threads-safe.
    }

    public void incrementJ() {
        j.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    public int getJ() {
        return j.get();
    }
}