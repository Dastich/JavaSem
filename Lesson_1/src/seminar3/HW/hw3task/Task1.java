package seminar3.HW.hw3task;

//Реализовать алгоритм сортировки слиянием
public class Task1 {
    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n == 1) return;
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int left2 = left.length;
        int right2 = right.length;
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left2 && j < right2) {
            if (left[i] < right[j]) {
                array[index] = left[i];
                i++;
                index++;
            } else {
                array[index] = right[j];
                j++;
                index++;

            }
        }
        for (int leftRemain = i; leftRemain < left2; leftRemain++)
            array[index++] = left[leftRemain];


        for (int rightRemain = j; rightRemain < right2; rightRemain++)
            array[index++] = right[rightRemain];

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+" ");
        }
        System.out.println(" ");
    }
}

