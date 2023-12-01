package org.kaebe.lists;

import java.util.ArrayList;

public class List<E> extends ArrayList<E> {
    public List() {
        super();
    }

    public List(int initialCapacity) {
        super(initialCapacity);
    }

    public List(java.util.Collection<? extends E> c) {
        super(c);
    }
}
