package com.company;

import java.util.Collection;
import java.util.Map;

public class GenericPrinterImpl<T extends Collection<Printable>> implements GenericPrinter<T>
{


    @Override
    public void printIt(T toPrint) {
        System.out.println("Collection info:");
        for(Printable a: toPrint)
            System.out.println(a.printMe() + " ");
    }

}
