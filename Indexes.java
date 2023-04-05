package Algorithm;

import java.util.Arrays;

public class Indexes {

    public static void main(String[] args) {
        int[] num = {9, 5, 7, 12};
        array(num);
    }

    public static void array(int[] arr) {
        int[] sumStore = new int[arr.length];
        int index = 0;
        int sum = 0;
        
        
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                sum = sum + arr[j];
            }

            sumStore[index] = sum;
            sum = 0;
            index++;

            for (int j = 0; j < arr.length; j++) {
                if (j == 1) continue;
                sum = sum + arr[j];
            }

            sumStore[index] = sum;
            sum = 0;
            index++;

            for (int j = 0; j < arr.length; j++) {
                if (j == 2) continue;
                sum = sum + arr[j];
            }

            sumStore[index] = sum;
            sum = 0;
            index++;

            for (int j = 0; j < arr.length; j++) {
                if (j == 3) continue;
                sum = sum + arr[j];
            }

            sumStore[index] = sum;
            if (index == (arr.length) -1) break;

        }

        System.out.println(Arrays.toString(sumStore));
        int highest = sumStore[0];
        int lowest = sumStore[0];
        int indexOfHighest = 0;
        int indexOfLowest = 0;


        for (int i = 0; i < sumStore.length; i++) {
            if (sumStore[i] > highest) {
                highest = sumStore[i];
            indexOfHighest = i;
            }

            if (sumStore[i] < lowest) {
                lowest = sumStore[i];
            indexOfLowest = i;
            }
        }


        System.out.print("(");
        System.out.print(indexOfLowest + ", " + indexOfHighest);
        System.out.println(")");


    }
}
