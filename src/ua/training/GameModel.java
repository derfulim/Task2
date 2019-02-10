package ua.training;

public class GameModel {
    private final int minRangeLimit = 0;
    private final int maxRangeLimit = 100;

    public int getMinRangeLimit() {
        return minRangeLimit;
    }

    public int getMaxRangeLimit() {
        return maxRangeLimit;
    }

    /**
     * Метод возвращает случайное число в диапазоне ограниченом аргументами.
     * Такая запись нужна чтобы обеспечить появление всех чисел в диапазоне включая границы.
     * @return
     */
    protected int getHiddenNumber() {
        int range = maxRangeLimit - minRangeLimit;
        return (int)(Math.random() * ++range) + minRangeLimit;
    }
}
