package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection {

    private List<Human> humansList;

    public ArrayListCollection(){humansList = null;}

    public ArrayListCollection(int numberOfHumans){
        this.addHowMuchHumans(numberOfHumans);
    }

    public void addHowMuchHumans(int numb){
        if (this.humansList == null)
            this.humansList = new ArrayList<>();
        for(int i = 0; i < numb; i++)
        {
            this.humansList.add(new Human());
        }
    }

    /**
     * @return string of all information about humans in humansList
     */
    public String getHumansInfo() {
        // added this strig for better readable
        String tempHumansString = "HumansArrayListInfo:\n";
        for(Human a: this.humansList)
            tempHumansString += a.toString();
        return tempHumansString;
    }

    public void deleteHumansWhoOlderThen(int age){
        Iterator<Human> humanIterator = this.humansList.listIterator();
        while(humanIterator.hasNext()){
            Human tempHuman = humanIterator.next();
            if (tempHuman.getHumanAge() >= age)
                humanIterator.remove();
        }

    }

    public List<Human> getHumansList() {
        return humansList;
    }

    public void setHumansList(List<Human> humansList) {
        this.humansList = humansList;
    }
}
