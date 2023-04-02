package seminar3.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void createList() {
        List<Integer> array = new ArrayList();
        Random rnd = new Random();
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        array.add(rnd.nextInt(11));
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }
}

