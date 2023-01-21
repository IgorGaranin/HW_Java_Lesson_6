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

        //Task 2
        System.out.println("Task2");
        //input
        System.out.println("input");
        int lenghtArrayT2 = 10;
        int[] arrForSearchMaxValue = createRandomIntArray(lenghtArrayT2);
        System.out.println("Массив: " + Arrays.toString(arrForSearchMaxValue));
        //output
        System.out.println("output");
        int maxValueT2 = searchMaxValueIntArr(arrForSearchMaxValue);
        System.out.println("Максимальное значение: " + maxValueT2);

        System.out.println("////////////////////////////////////////////////\n");
        // Task 3
        System.out.println("Task3");
        // input
        System.out.println("input");
        int lenghtArrayT3 = 10;
        int[] arrForSearchMinValue = createRandomIntArray(lenghtArrayT3);
        System.out.println("Массив: " + Arrays.toString(arrForSearchMinValue));
        // output
        System.out.println("output");
        int minValueT3 = searchMinValueIntArr(arrForSearchMinValue);
        System.out.println("Минимальное значение: " + minValueT3);

        // Task 4
        System.out.println("Task4");
        // input
        System.out.println("input");
        int[] arrSortT4 = createRandomIntArray(7);
        System.out.println("Массив: " + Arrays.toString(arrSortT4));
        //output
        System.out.println("output");
        System.out.println("Отсортированный по возрастанию массив: " + Arrays.toString(sortIntArr(arrSortT4)));

        // Task 5
        System.out.println("Task5");
        // input
        System.out.println("input");
        int[] arrForReversT5 = createRandomIntArray(8);
        System.out.println("Массив: " + Arrays.toString(arrForReversT5));
        //output
        System.out.println("output");
        System.out.println("Отсортированный по убыванию массив: " + Arrays.toString(sortReverseIntArr(arrForReversT5)));

        // Task 6
        System.out.println("Task 6");
        // input
        System.out.println("input");
        String inputStrT6 = "inputString";
        char inputCht6 = 'i';
        System.out.printf("Строка: %s, символ %c \n", inputStrT6, inputCht6);
        //output
        System.out.println(deleteCharInString(inputStrT6, inputCht6));







    }

    public static int[] createRandomIntArray(int lenghtArray) {
        int[] result = new int[lenghtArray];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 100);
        }

        return result;
    }

    public static int searchMaxValueIntArr(int[] intArrForSearchMaxValue) {
        int result = intArrForSearchMaxValue[0];

        for (int i = 0; i < intArrForSearchMaxValue.length; i++) {
            if (result < intArrForSearchMaxValue[i]) {
                result = intArrForSearchMaxValue[i];
            }
        }

        return result;
    }

    public static int searchMinValueIntArr(int[] arrForSearchMinValue){
        int result = arrForSearchMinValue[0];

        for (int i = 0; i < arrForSearchMinValue.length; i++) {
            if (result > arrForSearchMinValue[i]) {
                result = arrForSearchMinValue[i];
            }
        }

        return result;
    }

    public static int[] sortIntArr(int[] arrForSort){
        int[] result = arrForSort;
        Arrays.sort(result);
        return result;
    }

    public static int[] sortReverseIntArr (int[] arrForSortReverse){
        int[] result = new int[arrForSortReverse.length];
        int[] sortReverseArr = sortIntArr(arrForSortReverse);

        int j = 0;
        for (int i = sortReverseArr.length - 1; i >= 0; i--){
            result[j] = sortReverseArr[i];
            j++;
        }
        return result;
    }

    public static String deleteCharInString(String inputStr, char inputCh){
        String result = "";

        char[] arrInputT6 = inputStr.toCharArray();

        for (int i = 0; i < arrInputT6.length; i++) {
            if (arrInputT6[i] != inputCh){
                result = result + arrInputT6[i];
            }
        }
        return result;
    }
}
