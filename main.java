package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Ash", "2077");
        remindName();
        guessAge();
        count();
        // ...
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Yo! I Am " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("What's your name bro?");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Not bad, " + name + "!");
    }

    static void guessAge() {
        System.out.println("I will show you a magic trick.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?");
        System.out.println("1. idk");
        System.out.println("2. Because");
        System.out.println("3. To decompose a program into several small subroutines.");
        System.out.println("4. Why?");
        int answer = scanner.nextInt();
        if (answer == 3){
            end();
        }
        else {
            test();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
