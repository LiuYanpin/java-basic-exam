package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {
    private final Integer start;
    private final Integer end;

    public Sequence(Integer start, Integer end) {
        if (start >= end) { throw new IllegalArgumentException("Start must be smaller than End."); }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(start, end);
    }
}

class SequenceIterator implements Iterator<Integer> {
    private int start;
    private int end;

    SequenceIterator(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return start < end;
    }

    @Override
    public Integer next() {
        return start++;
    }
}
