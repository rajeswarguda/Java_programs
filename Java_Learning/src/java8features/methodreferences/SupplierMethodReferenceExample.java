package java8features.methodreferences;

import java.util.function.Function;
import java.util.function.Supplier;

import java8features.data.Student;

public class SupplierMethodReferenceExample {
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> f= Student::new;
    public static void main(String[] args) {

        System.out.println(studentSupplier.get());
        System.out.println(f.apply("sreedevi"));

    }
}
