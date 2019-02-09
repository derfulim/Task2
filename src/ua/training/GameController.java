package ua.training;

import java.util.Scanner;

public class GameController {
    //порядок следования переменных ссылочных и примитивов?
    private int minRangeLimit = 0;
    private int maxRangeLimit = 100;
    private int userNumber;
    private boolean isGameOver = false;
    private GameModel gameModel;
    private GameView gameView;
    Scanner scanner = new Scanner(System.in);
    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

    /*изменить имя метода*/
    private int processUserInput() {
        scanner.nextInt();

    return 1;
    }
}
