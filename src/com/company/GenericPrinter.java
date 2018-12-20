package com.company;

import java.util.Collection;
import java.util.Map;

public interface GenericPrinter<T> {
    void printIt(T toPrint);

    //void printIt(Map<Integer, T> toPrint);
}
