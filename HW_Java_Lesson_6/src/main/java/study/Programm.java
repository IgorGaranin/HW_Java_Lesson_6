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
        System.out.println("////////////////////////////////////////////////\n");

        // Task 4
        System.out.println("Task4");
        // input
        System.out.println("input");
        int[] arrSortT4 = createRandomIntArray(7);
        System.out.println("Массив: " + Arrays.toString(arrSortT4));
        //output
        System.out.println("output");
        System.out.println("Отсортированный по возрастанию массив: " + Arrays.toString(sortIntArr(arrSortT4)));
        System.out.println("////////////////////////////////////////////////\n");

        // Task 5
        System.out.println("Task5");
        // input
        System.out.println("input");
        int[] arrForReversT5 = createRandomIntArray(8);
        System.out.println("Массив: " + Arrays.toString(arrForReversT5));
        //output
        System.out.println("output");
        System.out.println("Отсортированный по убыванию массив: " + Arrays.toString(sortReverseIntArr(arrForReversT5)));
        System.out.println("////////////////////////////////////////////////\n");

        // Task 6
        System.out.println("Task 6");
        // input
        System.out.println("input");
        String inputStrT6 = "inputString";
        char inputCht6 = 'i';
        System.out.printf("Строка: %s, символ %c \n", inputStrT6, inputCht6);
        //output
        System.out.println("output");
        System.out.println(deleteCharInString(inputStrT6, inputCht6));
        System.out.println("////////////////////////////////////////////////\n");

        // Task 7
        System.out.println("Task 7");
        // input
        System.out.println("input");
        String inputStrT7 = "inputString";
        String inputCht7 = "i,n,r";
        System.out.printf("Строка :%s, символы: %s \n", inputStrT7, inputCht7);
        //output
        System.out.println("output");
        System.out.println(deleteCharsInString(inputStrT7,'i','n','r'));
        System.out.println("////////////////////////////////////////////////\n");

        // Task 8
        System.out.println("Task 8");
        // input
        System.out.println("input");

        // output
        System.out.println("1,2,4,8,15");
        System.out.println(checkIntsForTheSumOfTheRest(1,2,4,8,15));

        System.out.println("1,2,4,8,16");
        System.out.println(checkIntsForTheSumOfTheRest(1,2,4,8,16));




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

    public static String deleteCharsInString(String inputStrT7,char... inputChars) {

        String result = "";
        boolean symbolIsFined = false;

        char[] arrInputT7 = inputStrT7.toCharArray();

        for (int i = 0; i < arrInputT7.length; i++) {

            symbolIsFined = false;
            for (char ch: inputChars) {
                if(ch == arrInputT7[i]){
                    symbolIsFined = true;
                    break;
                }
            }

            if (symbolIsFined != true){
                result = result + arrInputT7[i];
            }

        }
        return result;
    }

    public static boolean checkIntsForTheSumOfTheRest(int... numbersT8) {
        boolean result = false;
        int summElements = 0;

        for (int i = 0; i < numbersT8.length; i++){
            summElements = 0;

            for (int j = 0; j < numbersT8.length; j++){
                if (j != i){
                    summElements = summElements + numbersT8[j];
                }
            }

            if (numbersT8[i] == summElements) {
                result = true;
                break;
            }
        }
        return result;
    }

}
