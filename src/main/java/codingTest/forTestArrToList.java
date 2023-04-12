package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forTestArrToList {
    public static void main(String[] args) {
        //문자열 타입 배열을 List로 변환
        String[] temp = {"apple", "banana", "lemon"};
        List<String> list = new ArrayList<>(Arrays.asList(temp));

//List를 문자열 배열로 변환
        List<String> list = new ArrayList<>();
        String[] temp = list.toArray(new String[list.size()]);

//정수 배열을 List로 변환
        int[] temp = {1, 2, 3, 4};
        List<Integer> list = new ArrayList<>(Arrays.asList(temp));

//List를 정수 배열로 변환
        List<Integer> list = new ArrayList<>();
        int[] temp = list.stream().mapToInt(x -> x).toArray();

    }

}
