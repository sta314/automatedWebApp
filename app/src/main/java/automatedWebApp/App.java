package automatedWebApp;

import java.util.ArrayList;

public class App {
    public static ArrayList<Integer> getNumbersLowerOrHigher(ArrayList<Integer> list, int pivot, boolean getHigher, boolean getEqualToo){

        ArrayList<Integer> curList = new ArrayList<>();

        for (Integer i : list){
            if (i == pivot){
                if (getEqualToo)
                    curList.add(i);
            }
            else if (i > pivot){
                if (getHigher)
                    curList.add(i);
            }
            else{
                if (!getHigher)
                    curList.add(i);
            }
        }

        return curList;
    }
}