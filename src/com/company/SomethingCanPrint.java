package com.company;


import java.util.Random;

public class SomethingCanPrint implements Printable, Comparable<SomethingCanPrint> {
    private final String someString;

    public SomethingCanPrint(String someString){
        this.someString = someString;
    }

    public SomethingCanPrint(){
        Random rand = new Random();
        this.someString = "DefaultString" + rand.nextInt(1000);
    }

    @Override
    public String printMe(){
        return "Some text " + this.getSomeString();
    }

    @Override
    public int compareTo(SomethingCanPrint obj) {
        String s1 = obj.getSomeString();
        String s2 = this.getSomeString();
        return s1.compareTo(s2);
    }

    public String getSomeString() {
        return someString;
    }

}
