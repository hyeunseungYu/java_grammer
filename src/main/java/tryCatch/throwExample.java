package tryCatch;

import java.util.Scanner;

public class throwExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("안녕하세요");
        String answer = scanner.nextLine();

        try {
            if (answer.equals("바보")) {
                throw new IllegalArgumentException("바보라고 하지 마세요");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
