package ua.training;

public class Main {
    public static void main(String[] args) {
//    new Test().testRandom();
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView();
        GameController gameController = new GameController(gameModel,gameView);
        gameController.start();
    }
}
