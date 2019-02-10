package ua.training;

import java.util.Scanner;

/**
 *
 */

 class GameController {
    private int hiddenNumber;
    private int stepCounter;
    private boolean isGameOver = false;
    private boolean isNewGameStarted = false;
    private GameModel gameModel;
    private GameView gameView;
    private Scanner scanner = new Scanner(System.in);



    GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

     void launch() {
        gameView.printMessage(GameView.GREETING);

        while(!isGameOver) {
            processUserInput(scanner.nextLine());
            }
        }

        private void processUserInput(String userInput) {

         if (userInput.equals(GameView.START_GAME)) {
             startNewGame();
         }
         else if (userInput.equals(GameView.QUIT_GAME)) {
             finishGame();
         }
         else if (isNewGameStarted) checkUserNumber(userInput);
        }

        private void startNewGame() {
            isNewGameStarted = true;
            stepCounter = 0;
            gameView.printMessage(GameView.START_LINE);
            hiddenNumber = gameModel.getHiddenNumber();
         }

        private void finishGame(){
         isNewGameStarted = false;
         isGameOver = true;
        gameView.printMessage(GameView.EXIT);}

        private void checkUserNumber(String userInput) {
         try {
            int userNumber = Integer.parseInt(userInput);

            if ((userNumber<gameModel.getMinRangeLimit()) || (userNumber>gameModel.getMaxRangeLimit())) {
                gameView.printMessage(GameView.WRONG_NUMBER);
            }
            else if(userNumber>hiddenNumber) {
                stepCounter++;
                gameView.printAdvice(GameView.MORE_NUMBER);
            }
            else if(userNumber<hiddenNumber) {
                stepCounter++;
                gameView.printAdvice(GameView.LESS_NUMBER);
            }
            else if (userNumber == hiddenNumber) {
                stepCounter++;
                gameView.printUserStat(stepCounter, userNumber);
            }
        }
            catch (NumberFormatException e) {gameView.printMessage(GameView.OTHER_SYMBOL);}}
 }



