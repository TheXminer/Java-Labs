import java.io.Console;

public class Task40 {// Метод для перевірки, чи відповідає аргумент шаблону
    public static String changeTemplate(String str){
        if(str == null || str.isEmpty()){
            return null;
        }
        if(!isValidPattern(str))
            return null;
        return transformToUpper(str);
    }

    public static boolean isValidPattern(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.matches("[a-zA-Zа-яА-ЯіїєґІЇЄҐ]+");
    }

    public static String transformToUpper(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.toUpperCase();
    }

    public static void task40(String[] args){
        if(args == null)
            return;
        for (int i = 0; i < args.length; i++) {
            String curText = args[i];
            args[i] = changeTemplate(args[i]);
            curText += " --> " + args[i];
            System.out.println(curText);
        }
    }
}
