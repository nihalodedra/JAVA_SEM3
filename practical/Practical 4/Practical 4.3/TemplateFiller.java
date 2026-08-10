public class TemplateFiller {

    public static String fill(String template, String[] names, String[] values) {

        for (int i = 0; i < names.length; i++) {
            template = template.replace(
                "{" + names[i] + "}",
                values[i]
            );
        }

        template = template.replaceAll("\\{\\w+\\}", "[?]");

        return template;
    }
}