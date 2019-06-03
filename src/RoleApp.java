import java.util.Arrays;

public class RoleApp {
    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Аммос Федорович 45: Как ревизор65?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        StringBuilder scenario = new StringBuilder();
        for (int rol = 0; rol < roles.length; rol++) {
            scenario.append(roles[rol]).append(":\n");
            for (int lines = 0; lines < textLines.length; lines++) {
                if (textLines[lines].startsWith(roles[rol] + ":")) {
                    scenario.append(lines + 1).append(")").append(textLines[lines].substring(textLines[lines].indexOf(':') + 1)).append("\n");
                }
            }
            scenario.append('\n');
        }
        System.out.println(scenario);
    }
}
