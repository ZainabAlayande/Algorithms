package LeetCodeQuestions;

public class TrailingZeros {

    private static int getCountOfTrailingZeros(int number) {
        int count = 0;
        while (number > 0) {
            number /= 5;
            count += number;
        }

        return count;
    }
}
