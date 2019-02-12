package ua.training;

import java.util.List;

class GameView {

     private static final String INPUT_INT_DATA = "INPUT INT VALUE IN RANGE ";
     private static final String LEFT_BRACKET = "[";
     private static final String RIGHT_BRACKET = "]";
     private static final String SEPARATOR = " ";
     static final String WRONG_INPUT_DATA = "YOU TYPED ANOTHER SYMBOL.";
     static final String WRONG_RANGE_DATA = "YOUR VALUE IS NOT IN DIAPASON. ";
     static final String LESS_THAN_SECRET = "YOUR VALUE IS LESS THAN SECRET.";
     static final String GREATER_THAN_SECRET = "YOUR VALUE IS GREATER THAN SECRET.";
     static final String CONGRATULATION = "CONGRATULATION! YOU GUESSED THE NUMBER ";
     private static final String HISTORY = "YOUR HISTORY: ";




     void printMessage(String message) {
        System.out.println(message);
    }

    void printRange(int minBarrier, int maxBarrier) {
        System.out.println(INPUT_INT_DATA + LEFT_BRACKET + minBarrier + SEPARATOR + maxBarrier + RIGHT_BRACKET);
    }

    void printHistory(List<Integer> history) {
        System.out.print(HISTORY);
        for (Integer element:history
             ) {
            System.out.print(element.toString() + " ");
        }
    }





}
