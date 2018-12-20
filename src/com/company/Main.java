package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    /*
     some temp test
      */
	    Human human1 = new Human();
        System.out.println(human1.toString());

    /*
     testArrayList
      */
        ArrayListCollection humansList = new ArrayListCollection();
        humansList.addHowMuchHumans(5);
        System.out.println(humansList.getHumansInfo());
        humansList.deleteHumansWhoOlderThen(30);
        System.out.println(humansList.getHumansInfo());

/*
    TEST LESSON5: GenericPrinterImpl
 */
        GenericPrinter<Collection<Printable>> genericPrinter = new GenericPrinterImpl<>();
        Printable printableObj = new SomethingCanPrint();

        // make new collections
        List<Printable> printableArrayList = new ArrayList<>();
        Set<Printable> printablesTreeSet = new TreeSet<>();
        Set<Printable> printableHashSet = new HashSet<>();
        Map<Integer, Printable> printableMap = new TreeMap<>();

        // add object to collections
        for(int i = 0; i < 10; i++) {
            printableArrayList.add(new SomethingCanPrint());
            printableHashSet.add(new SomethingCanPrint());
            printablesTreeSet.add(new SomethingCanPrint());
            printableMap.put(i, new SomethingCanPrint());
        }

        /*
            use generic printer
         */
        genericPrinter.printIt(printableArrayList);
        genericPrinter.printIt(printablesTreeSet);
        genericPrinter.printIt(printableHashSet);
    }
}
