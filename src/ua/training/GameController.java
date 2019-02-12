package ua.training;

import java.util.Scanner;


 class GameController implements GlobalConstants {

    private GameModel gameModel;
    private GameView gameView;
    private int userValue = 0;
    private Scanner sc = new Scanner(System.in);

    GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

    void launch () {
        boolean isValueWrong = true;

        gameModel.setPrimaryBarriers(GlobalConstants.MIN_BARRIER, GlobalConstants.MAX_BARRIER);
        gameView.printRange(gameModel.getMinBarrier(), gameModel.getMaxBarrier());
        gameModel.setSecretValue();

        while (isValueWrong) {
            userValue = processUserInput(sc);
            isValueWrong = gameModel.checkUserValue(userValue);

            if (userValue == gameModel.getMinBarrier()) {
                gameView.printMessage(GameView.LESS_THAN_SECRET);
            }
            else if (userValue == gameModel.getMaxBarrier()){
                gameView.printMessage(GameView.GREATER_THAN_SECRET);
            }
        }

            gameView.printMessage(GameView.CONGRATULATION + userValue);
            gameView.printHistory(gameModel.getHistory());
    }



     private int processUserInput(Scanner sc) {

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                gameView.printMessage(GameView.WRONG_INPUT_DATA);
                gameView.printRange(gameModel.getMinBarrier(),gameModel.getMaxBarrier());
                sc.next();
            }
            // check value in diapason
            if ((userValue = sc.nextInt()) < gameModel.getMinBarrier() ||
                    userValue > gameModel.getMaxBarrier()) {
                gameView.printMessage(GameView.WRONG_RANGE_DATA);
                gameView.printRange(gameModel.getMinBarrier(),gameModel.getMaxBarrier());
                continue ;
            }
            break;
        }
        return userValue;
    }


 }



