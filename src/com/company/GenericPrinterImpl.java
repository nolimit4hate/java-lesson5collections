package com.company;

import java.util.Collection;
import java.util.Map;

public class GenericPrinterImpl<T extends Printable> implements GenericPrinter<Integer, T>
{

    @Override
    public void printIt(T toPrint) {
        System.out.println(toPrint.printMe());
    }

    @Override
    public void printIt(Collection<T> toPrint) {
        System.out.println("Collection info:");
        for(T a: toPrint)
            System.out.println(a.printMe() + " ");
    }

    @Override
    public void printIt(Map<Integer, T> toPrint) {
        for(Map.Entry<Integer, T> entry : toPrint.entrySet()){
            System.out.println(entry.getValue().printMe() + " ");
        }
    }

}
