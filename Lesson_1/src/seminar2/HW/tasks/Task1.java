package seminar2.HW.tasks;

import seminar2.Log;
import seminar2.Task5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task1 {
    private static final Logger LOG = Log.log(Task5.class.getName());

    public static int[] createRandomArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
        }
        return array;
    }

    //1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    public static int[] bubbleSort(int[] array) {
        StringBuilder info = new StringBuilder();
        StringBuilder info2 = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            info.append(array[i]);
        }
        String inforesult = info.toString();
        LOG.info("Массив до изменения: " + inforesult);
        int temp = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
                    temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            info2.append(array[i]);
        }
        String resultinfo2 = info2.toString();
        LOG.info(resultinfo2);
        return array;
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
