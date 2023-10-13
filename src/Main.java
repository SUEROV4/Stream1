import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student(1, "japarov Айдар"),
                new Student(2, "kanyshbekov BAIJIGIT"),
                new Student(3, "jeims Gosnik"),
                new Student(4, "Alym")
        );

        List<String> surnamesList = studentStream
                .map(Student::getFIO)
                .map(fio -> fio.split(" ")[0])
                .collect(Collectors.toList());


        System.out.println("Фамилиялардын тизмеси: " + surnamesList);
    }

}
