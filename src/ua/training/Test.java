package ua.training;

public class Test {
     int iterations = 100;

    private GameModel gameModel;
    private GameController gameController;
    private GameView gameView;

    public Test() {
        this.gameModel = new GameModel();
    }

    void testRandom() {
        int array[] = new int[iterations];

        for (int i = iterations-1; i>=0; i--) {
            array[i] = gameModel.getNumber(0, 100);
        }

    }
}
