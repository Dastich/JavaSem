package seminar3.tasks;

import java.util.ArrayList;

public class Task3 {
    public static void deleteDigital() {
        ArrayList list = new ArrayList<String>();
        list.add("Hello");
        list.add(123);
        list.add(255);
        list.add(903);
        list.add("profi");
        list.add(321);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(list.get(i));
                i--;
            }
            System.out.println(list);
        }
    }
}
