import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyColumn { // Renamed the annotation to resolve the duplicate name clash
    String name();
}

class Student {
    @MyColumn(name = "name")
    String name;

    @MyColumn(name = "age")
    int age;

    @MyColumn(name = "course")
    String course;

    @Override
    public String toString() {
        return name + " " + age + " " + course;
    }
}

public class Column { // Kept your main class name exactly as 'Column'
    public static void main(String[] args) throws Exception {
        String[] header = {"age", "name", "course"};
        String[] data = {"19", "Nihal", "AIML"};

        Student student = new Student();

        for (Field field : Student.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(MyColumn.class)) {
                String columnName = field.getAnnotation(MyColumn.class).name();
                int index = -1;

                for (int i = 0; i < header.length; i++) {
                    if (header[i].equals(columnName)) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("Missing column: " + columnName);
                    continue;
                }

                field.setAccessible(true);

                if (field.getType() == int.class) {
                    field.set(student, Integer.parseInt(data[index]));
                } else {
                    field.set(student, data[index]);
                }
            }
        }

        System.out.println(student);
    }
}
