package tryCatch;

import java.util.Scanner;

public class throwsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("내용 입력하세요");
            String answer = scanner.nextLine();

            answerText(answer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String answerText(String answer) throws Exception{
        if (answer == null || answer.equals("")) {
            throw new Exception("공백은 아니되오");
        }

        System.out.println(answer);
        return answer;

    }
}
