package com.hillel.language.basis11.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EnhancedContainer<T> implements Iterable {

    private List<T> list;
    private final int maxSize;

    EnhancedContainer(int n) {
        this.maxSize = n;
        this.list = new ArrayList<>(n);
    }

    public void add(T element) {
        if (list.size() < this.maxSize) {
            list.add(element);
        } else {
            list.remove(0);
            list.add(element);
        }
    }

    // !!
    public List<T> get() throws EmptyContainerException {
        if (list.isEmpty()) {
            throw new EmptyContainerException();
        }
        return Collections.unmodifiableList(list);
    }

    @Override
    public Iterator<T> iterator() {
        return new ContainerIterator();
    }

    private class ContainerIterator implements Iterator<T> {

        int current = -1;

        @Override
        public boolean hasNext() {
            return EnhancedContainer.this.list.size() > current + 1;
        }

        @Override
        public T next() {
            if (current < EnhancedContainer.this.list.size() - 1) {
                current++;
                return EnhancedContainer.this.list.get(current);
            }

            else {
                throw new NextElementMissingException();
            }
        }
    }
}
