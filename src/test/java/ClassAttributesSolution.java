import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassAttributesSolution {


    public static void main(String[] args) {
        Class<Student> classOfStudent = Student.class;
        var methods = classOfStudent.getDeclaredMethods();
        var method_names = Arrays.stream(methods)
                .map(Method::getName)
                .toArray(String[]::new);

        Arrays.stream(method_names)
                .sorted()
                .forEach(System.out::println);
    }
}

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }

}
