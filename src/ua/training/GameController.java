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
            gameView.printMessage(GameView.WRONG_INPUT);
        }

        if(userNumber>hiddenNumber) {
            gameView.printMessage(GameView.MORENUMBER);
            maxRangeLimit = userNumber;
        }
        else if(userNumber<hiddenNumber) {
            gameView.printMessage(GameView.LESS_NUMBER);
            minRangeLimit = userNumber;

        }
        else if (userNumber == hiddenNumber) {
            gameView.printMessage(GameView.CONGRATULATION);
        }
        }
        catch (NumberFormatException e) {gameView.printMessage(GameView.WRONG_INPUT);} //должно быть свое сообщение!
        }
    }



