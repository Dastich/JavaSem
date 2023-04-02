package seminar2.HW.tasks;

public class Task2 {
    //    Дана строка json:
//    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//     {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//    Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//    Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//    Студент Иванов получил 5 по предмету Математика.
//    Студент Петрова получил 4 по предмету Информатика.
//    Студент Краснов получил 5 по предмету Физика.
    public static void parcingText() {


        String value = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        value = value.replaceAll("\"", " "); //убираем знаки "
        String[] temp = value.split("}"); // Делим строку в первый раз, получая отдельную строку по конкретному человеку.
        String firstResult=temp[0];
        String[] firstStudent=firstResult.split(",");
        String surnameFirstStudent=firstStudent[0];
        String subjectOfStudeFirstStudent=firstStudent[1];
        String scoreOfFirstStudent=firstStudent[2];
        String[] resultOfsurnameFirstStudent=surnameFirstStudent.split(":");
        String[] resultOfscoreOfFirstStudent=subjectOfStudeFirstStudent.split(":");
        String[] resultOfsubjectOfStudeFirstStudent=scoreOfFirstStudent.split(":");
        StringBuilder builder=new StringBuilder();
        builder.append("Студент "+ resultOfsurnameFirstStudent[1]+" получил "+resultOfscoreOfFirstStudent[1]+" по предмету "+ resultOfsubjectOfStudeFirstStudent[1]);
        System.out.println(builder.toString());
    }
}