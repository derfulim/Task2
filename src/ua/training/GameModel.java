package ua.training;

import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private int maxBarrier;
    private int secretValue;
    private List <Integer> history = new ArrayList<>();

    private int minBarrier;

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public List<Integer> getHistory() {
        return history;
    }

    /**
     * We decrement arguments values because primary barriers values are not included to the range.
     * If this condition changes - check this method.
     * @param minLimit - minimum limit of the range.
     * @param maxLimit - maximum limit of the range.
     */
    void setPrimaryBarriers(int minLimit, int maxLimit) {
        minBarrier = ++minLimit;
        maxBarrier = --maxLimit;
    }

    /**
     * That method generates secret value in the range that includes its minimum and maximum barriers.
     */
     void setSecretValue() {
        int range = maxBarrier - minBarrier;
        secretValue = (int)(Math.random() * ++range) + minBarrier;
    }

    boolean checkUserValue(int userValue) {
         history.add(userValue);
         if (userValue == secretValue) {
             return false;
         }
         if(userValue<secretValue) {
             minBarrier = userValue;
         }
         if (userValue>secretValue) {
             maxBarrier = userValue;
         }
         return true;
    }




}
