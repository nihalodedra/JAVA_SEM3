public class TemplateFillerDriver {

    public static void main(String[] args) {

        String template = "Dear {name}, order {id} ships {date}.";

        String[] names = {"name", "id"};
        String[] values = {"Riya", "A07"};

        String result = TemplateFiller.fill(template, names, values);

        System.out.println(result);
        System.out.println("25AIML039");
    }
}
