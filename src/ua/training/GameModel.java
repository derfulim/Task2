package ua.training;

public class GameModel {

    protected long getNumber(int minRangeLimit, int maxRangeLimit) {

        return Math.round(Math.random()*(maxRangeLimit-minRangeLimit));
    }
}
