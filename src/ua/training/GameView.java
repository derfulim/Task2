package ua.training;

import java.util.Date;

class GameView {

     static final String GREETING = "****************************** Угадай число! *****************************\n" +
             "Чтобы начать/перезапустить игру нажмите s, чтобы закончить игру нажмите q.";
     static final String START_LINE = "Введите целое положительное число  от 0 до 100.";    //добавить форматирование строки для пределов
     static final String WRONG_NUMBER = "Ваше число не входит в диапазон, введите другое число.";
     static final String OTHER_SYMBOL = "Вы ввели вместо числа другой символ. Пожалуйста, введите ваше число!";
     static final String LESS_NUMBER = "меньше";
     static final String MORE_NUMBER = "больше";
     static final String EXIT = "Вы вышли из игры.";
     static final String START_GAME = "s";
     static final String QUIT_GAME= "q";



     void printMessage(String message) {
        System.out.println(message);
    }

     void printAdvice(String tolerance){
         System.out.println("Ваше число " + tolerance + " загаданного. Делайте следующий ход.");
     }

     void printUserStat(int steps, int userNumber){
         System.out.println("Поздравляем! Вы угадали число " + userNumber + " за " + steps +
                 " хода/ходов. Чтобы начать новую игру введите " + START_GAME +
                 ", чтобы выйти из игры нажмите " + QUIT_GAME + ".");
     }



}
