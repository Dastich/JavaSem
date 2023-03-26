package Seminar1.Tasks;

public class Task2 {
    public static int run(int[] array) {
        int max_count = 0;
        int current_count = 0;
        for (int item : array) {
            if (item == 1) {
                current_count++;
            } else {
                if (current_count > max_count) {
                    max_count = current_count;
                    current_count = 0;
                }
            }
        }
        if (current_count > max_count) {
            max_count = current_count;
        }
        return max_count;
    }
}

