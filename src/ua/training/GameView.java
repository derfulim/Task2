package ua.training;

 class GameView {

     static final String GREETING = "Угадай число! Чтобы начать/перезапустить игру нажмите s, чтобы закончить игру нажмите q";
     static final String START_LINE = "Введите целое положительное число  от 0 до 100";    //добавить форматирование строки для пределов
     static final String WRONG_NUMBER = "Ваше число не входит в диапазон, введите другое число";
     static final String OTHER_SYMBOL = "Вы ввели вместо числа другой символ. Пожалуйста, введите ваше число!";
     static final String LESS_NUMBER = "Ваше число  меньше загаданного, продолжайте"; //добавить тут вывод числа пользователя
     static final String MORENUMBER = "Ваше число больше загаданного"; //добавить тут вывод числа пользователя
     static final String CONGRATULATION = "Поздравляем! Вы угадали число за хода(ходов). Чтобы начать новую игру введите , чтобы выйти нажмите ";
     static final String EXIT = "Вы вышли из игры.";

     void printMessage(String message) {
        System.out.println(message);
    }



}
