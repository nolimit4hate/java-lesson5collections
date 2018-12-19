package com.company;

import java.util.Collection;
import java.util.Map;

public interface GenericPrinter<Integer, T> {
    void printIt(T toPrint);
    void printIt(Collection<T> toPrint);
    void printIt(Map<Integer, T> toPrint);
}
