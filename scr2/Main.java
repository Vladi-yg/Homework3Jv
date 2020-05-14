import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        // "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
        // "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
        // компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] symbols = new char[]{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        int n = ((int) (Math.random() * (words.length + 1))); // умножаю на words.length + 1, чтобы включить последнее слово внутри массива words
        String hiddenword = words[n]; // загадал слово
        int lenhidword = hiddenword.length(); // сохраняю длину загаданного слова
        System.out.println(hiddenword);
        Scanner scanner = new Scanner(System.in);
        char[] hiddensymbols = hiddenword.toCharArray(); // создал массив состоящий из символов строки hiddenword
        int k = 0;
        do {
            System.out.println("Угадайте слово");
            String answer = scanner.nextLine(); // случай, если пользователь угадал слово
            if (hiddenword.equals(answer)) {
                System.out.println("Вы угадали");
                break;
            } else if (answer != hiddenword) {
                char[] answersymbols = answer.toCharArray();
                for (int i = 0; i < lenhidword; i++) {
                    if (i >= answersymbols.length) {
                        break;
                    }
                    if (hiddenword.charAt(i) != answersymbols[i]) {
                        answersymbols[i] = '#'; // символы, которые были угаданы неверно "закрашиваются решеткой"
                    }
                    System.out.print(answersymbols[i]);
                }
                for (int j =0; j < symbols.length-answersymbols.length; j++) {
                    System.out.print(symbols[j]);
                }

            }

        }while (true) ;
    }
}




