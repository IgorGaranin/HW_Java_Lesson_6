package study;

import java.util.Arrays;

public class Programm {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        //input
        System.out.println("input");
        int lenghtArrayT1 = 5;
        System.out.println("Длина массива 5");
        // output
        System.out.println("output");
        int[] randomIntArr = createRandomIntArray(lenghtArrayT1);
        System.out.println(Arrays.toString(randomIntArr));

        System.out.println("////////////////////////////////////////////////\n");



    }

    public static int[] createRandomIntArray(int lenghtArray){
        int[] result = new int[lenghtArray];
        for (int i = 0; i < result.length; i++) {
            result[i] =(int)(Math.random()*100);
        }

        return result;
    }
}
