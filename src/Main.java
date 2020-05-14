import java.util.Scanner;

public class Main {
    //1. Написать программу, которая загадывает случайное число от 0 до 9,
    // и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args) {
        int hiddennum = ((int)(Math.random()*10));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Введите загаданное число");
            int mynum = scanner.nextInt();
                 if (i == 2 & mynum == hiddennum) {
                       System.out.println("Вы угадали");
                       System.out.println("Попытки закончились");
                       break;
                 } else if (i == 2 & mynum != hiddennum) {
                           System.out.println("Вы не угадали");
                           System.out.println("Попытки закончились");
                           break;
                 }
            if (mynum == hiddennum) {
                   System.out.println("Вы угадали");
                   System.out.println("Хотите сыграть еще?");
                   int answer = scanner.nextInt();
                       if (answer == 0) {
                           break;
                       } else if (answer == 1) {
                            continue;
                       }

               } else if (mynum != hiddennum) {
                               System.out.println("Вы не угадали");
                               System.out.println("Хотите сыграть еще?");
                               int answer = scanner.nextInt();
                                  if (answer == 0) {
                                  break;
                                  } else if (answer == 1) {
                                       continue;
                                  }

               }
        }
    }
}
