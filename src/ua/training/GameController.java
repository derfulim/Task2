package ua.training;

import java.util.Scanner;

 class GameController {
    //порядок следования переменных ссылочных и примитивов?
    private int minRangeLimit = 0;
    private int maxRangeLimit = 100;
    private boolean isGameOver = false;
    private GameModel gameModel;
    private GameView gameView;
    private Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;
    private int stepCounter;


     GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

     void start() {
        String userInput;


        gameView.printMessage(GameView.GREETING);
        while(!isGameOver) {
            userInput = scanner.nextLine();
            switch (userInput){
                case "q":
                    isGameOver = true;
                    gameView.printMessage(GameView.EXIT);
                    break;
                case "s":
                    //сбросить пределы! вынести в метод модели
                    gameView.printMessage(GameView.START_LINE);
                    hiddenNumber = gameModel.getHiddenNumber(minRangeLimit,maxRangeLimit);
                    break;
                default:
            processNumber(userInput);
            }
            }

        }

        private void processNumber(String userInput) {
        try{
        int userNumber = Integer.parseInt(userInput);

        if ((userNumber<minRangeLimit) || (userNumber>maxRangeLimit)) {
            gameView.printMessage(GameView.WRONG_NUMBER);
        }

        if(userNumber>hiddenNumber) {
            maxRangeLimit = userNumber;
            stepCounter++;
            gameView.printMessage(GameView.MORENUMBER);
        }
        else if(userNumber<hiddenNumber) {
            minRangeLimit = userNumber;
            stepCounter++;
            gameView.printMessage(GameView.LESS_NUMBER);
        }
        else if (userNumber == hiddenNumber) {
            stepCounter++;
            gameView.printMessage(GameView.CONGRATULATION);
        }
        }
        catch (NumberFormatException e) {gameView.printMessage(GameView.OTHER_SYMBOL);}
        }
    }



