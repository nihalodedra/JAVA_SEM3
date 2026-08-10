import java.util.regex.Pattern;

public class Validator {

    public static boolean isValidMobile(String x) {
        return Pattern.matches("[6-9][0-9]{9}", x);
    }

    public static boolean isValidEmail(String x) {
        return Pattern.matches(".+@.+\\..+", x);
    }

    public static boolean isValidPan(String x) {
        return Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]", x);
    }

    public static boolean isValidIfsc(String x) {
        return Pattern.matches("[A-Z]{4}0[A-Z0-9]{6}", x);
    }
}
