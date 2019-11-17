import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Project name: LettersTests
 * User: Alla
 * Date: 17.11.2019
 * Time: 10:21
 * Написать программу игры в угадывание букв.
 * Пользователь должен угадать загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры.
 * Если пользователь угадал букву, программа выводит сообщение о выигрыше и количестве попыток пользователя.
 * Если буква не угадана, программа предлагает ввести другую букву. При этом программа выводит подсказки. Если пользователь
 * ввел букву меньше загаданной – вывести сообщение об этом (например, «Too low!»). Аналогично при вводе буквы больше загаданной
 * (например, «Too high!»). Если введена не латинская буква – предложить пользователю внимательно ознакомиться с правилами игры.
 * Программа должна быть не чувствительна к регистру введенной пользователем буквы. Например, при загаданной букве ‘G’ ответы
 * пользователя ‘G’ или ‘g’ в равной степени считаются правильными.
 * Игра продолжается до выигрыша пользователя.
 */
public class Main {

    public static void main(String[] args) {
        final int letter = generateBetween(Constants.FIRST, Constants.LAST);
        char input = 0;
        int attempts = 0;
        System.out.println("Enter letter:");

        while (input != letter) {
            input = toUppercase(readSymbol());
            attempts++;
            if (!isLatinLetter(input)) {
                System.out.println("ReRead rules!");
            } else if (input == letter) {
                System.out.println("You are won! That's your " + attempts + " attempt. Good job :D");
            } else if (input > letter)
                System.out.println("Too High!");
            else System.out.println("Too Low!");

        }

    }


    static boolean isLatinLetter(char c) {
        return (c >= Constants.FIRST && c <= Constants.LAST);
    }


    public static int generateBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static char readSymbol() {
        Scanner s = new Scanner(System.in);
        return s.next().charAt(0);
    }

    public static char toUppercase(char ch) {
        return Character.toUpperCase(ch);
    }
}
