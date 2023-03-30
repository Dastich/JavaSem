package seminar2;
import seminar2.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task5 {
    private static final Logger LOG = Log.log(Task5.class.getName());




    public static void write(String path) {
        try (FileWriter in = new FileWriter("task5.txt");) {
            String[] data = getFileInHolder(path);
            for (String datum : data) {
                in.append(datum);
            }
            System.out.println("File recorded!");
        } catch (IOException e) {
            LOG.log(Level.INFO,e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public static String[] getFileInHolder(String path) {
        File dir = new File(path);
        String[] result = null;
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;

                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой ");
        }

        return result;
    }

}
