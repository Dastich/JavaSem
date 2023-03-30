package seminar2.HW;

import seminar2.HW.tasks.Task1;

public class Main {
    public static void main(String[] args) {
        int [] first = Task1.createRandomArray();
        Task1.printArray(first);
        int[] result = Task1.bubbleSort(first);
        Task1.printArray(result);
     }
}
