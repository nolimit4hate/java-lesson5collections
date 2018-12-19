package com.company;

import java.util.Random;

/**
 * Human class - some human with name - @param humanName, age - @param humanAge, gender - @param humanGender
 */
public class Human {
    //
    String humanName;
    int humanAge;
    /*
     * @param humanGender = true(man); false(woman)
     */
    boolean humanGender;

    public Human(String humanName, int humanAge, boolean humanGender){
        this.humanName = humanName;
        this.humanAge = humanAge;
        this.humanGender = humanGender;
    }
    /*
     * some random human
     */
    public Human(){
        Random randNumber = new Random();
        this.humanName = "DefaultHuman#" + randNumber.nextInt(100);
        this.humanAge = randNumber.nextInt(100);
        if(randNumber.nextInt(99) % 2 == 0)
            this.humanGender = true;
        else
            this.humanGender = false;
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanName='" + humanName + '\'' +
                ", humanAge=" + humanAge +
                ", humanGender=" + humanGender +
                "}\n";
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }

    public boolean isHumanGender() {
        return humanGender;
    }

    public void setHumanGender(boolean humanGender) {
        this.humanGender = humanGender;
    }
}
