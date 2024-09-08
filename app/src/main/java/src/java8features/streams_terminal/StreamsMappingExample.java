package java8features.streams_terminal;


import java.util.List;
import java.util.Set;

import java8features.data.Student;
import java8features.data.StudentDataBase;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

    public static void main(String[] args) {

       Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet())); // this avoids the additional map intermediate operation.

        System.out.println("namesSet : " + namesSet);

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList())); // this avoids the additional map intermediate operation.

        System.out.println("namesList : " + namesList);

    }

}
