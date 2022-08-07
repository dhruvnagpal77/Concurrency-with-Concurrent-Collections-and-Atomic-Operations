package com.package2.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _1BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock(); // Lock for i
    Lock lockForJ = new ReentrantLock(); // Lock for j


    public void incrementI() {
        lockForI.lock(); // Acquires the lock. If some other thread has already acquired this lock then the current thread waits.
        i++;
        lockForI.unlock(); // Releases the lock
    }

    public void incrementJ() {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
// With Lock, we can have 1 thread operating method incrementI & another thread operation method incrementJ
// 2 different thread can't acquire same Lock at a time, but they can acquire 2 different Lock at a time, so it's better than synchronised where 2 different threads can't acquire any synchronized code on an instance.