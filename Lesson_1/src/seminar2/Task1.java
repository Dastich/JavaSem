package seminar2;

import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.in;

public class Task1 {
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1
public static String PrintText(int N, char c1, char c2) {
    StringBuilder builder= new StringBuilder();
    for (int i = 0; i < N; i++) {
        if(i%2==0) {
            builder.append(c1);
        }
        else {
            builder.append(c2);
        }

    }
    return builder.toString();
}

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public static void saveToFile() {
    try( FileWriter in = new FileWriter("test.txt");) {
        in.append(createString());
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}



public static String createString() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 100; i++) {
        builder.append("TEST");

    }
    return builder.toString();
}
}
