package ua.training;

public class GameModel {
    /**
     * Метод возвращает случайное число в диапазоне ограниченом аргументами.
     * Такая запись нужна чтобы обеспечить появление всех чисел в диапазоне включая границы.
     * @param minRangeLimit
     * @param maxRangeLimit
     * @return
     */
    protected int getNumber(int minRangeLimit, int maxRangeLimit) {
        int range = maxRangeLimit - minRangeLimit;
        return (int)(Math.random() * ++range) + minRangeLimit;
    }
}
