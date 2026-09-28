package service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import model.annotation.Positive;
import model.annotation.MaxLength;

public class AnnotationValidator {

    public static String[] validate(Object obj) {

        List<String> errors = new ArrayList<>();

        Class<?> cls = obj.getClass();

        while (cls != null) {

            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {

                field.setAccessible(true);

                try {

                    Object value = field.get(obj);

                    if (field.isAnnotationPresent(Positive.class)) {

                        Positive positive =
                                field.getAnnotation(Positive.class);

                        long number = (long) value;

                        if (number <= 0) {
                            errors.add(field.getName() + " "
                                    + positive.message());
                        }
                    }

                    if (field.isAnnotationPresent(MaxLength.class)) {

                        MaxLength maxLength =
                                field.getAnnotation(MaxLength.class);

                        String text = (String) value;

                        if (text != null &&
                                text.length() > maxLength.value()) {

                            errors.add(field.getName()
                                    + " length must be <= "
                                    + maxLength.value());
                        }
                    }

                } catch (Exception e) {
                    errors.add("Error checking " + field.getName());
                }
            }

            cls = cls.getSuperclass();
        }

        return errors.toArray(new String[0]);
    }
}