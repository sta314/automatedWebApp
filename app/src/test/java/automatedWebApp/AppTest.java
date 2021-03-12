package automatedWebApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;


class AppTest {

    @Test void returnsHigherNumbersCorrectly(){
        ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(5, 15, 7, 21, 33, 4, 3));
        int pivot = 10;
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(15, 21, 33));

        assertEquals(expectedOutput, App.getNumbersLowerOrHigher(inputList, 10, true, false));
    
    }

    @Test void returnsLowerNumbersCorrectly(){
        ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(5, 15, 7, 21, 33, 4, 3));
        int pivot = 10;
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(5, 7, 4, 3));

        assertEquals(expectedOutput, App.getNumbersLowerOrHigher(inputList, 10, false, false));
    }
    
    @Test void returnsEqualNumbersIfDesired(){
        ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(5, 10, 20));
        int pivot = 10;
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(5, 10));

        assertEquals(expectedOutput, App.getNumbersLowerOrHigher(inputList, 10, false, true));
    }

    
    @Test void notReturnsEqualNumbersIfNotDesired(){
        ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(5, 10, 20));
        int pivot = 10;
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(5));

        assertEquals(expectedOutput, App.getNumbersLowerOrHigher(inputList, 10, false, false));
    }

    @Test void returnsEmptyListWhenInputIsEmpty(){
        ArrayList<Integer> inputList = new ArrayList<>();
        int pivot = 10;
        ArrayList<Integer> expectedOutput = new ArrayList<>();

        assertEquals(expectedOutput, App.getNumbersLowerOrHigher(inputList, 10, false, false));
    }

}
