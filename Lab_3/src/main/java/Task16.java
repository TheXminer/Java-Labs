public class Task16 {
    public static boolean isInteger(String str){
        if(str == null || str.isEmpty())
            return false;
        return str.matches("[+-]?\\d+");
    }
    public static int getLen(String str){
        if(str == null)
            return 0;
        return str.length();
    }
    public static void task16(String[] args){
        System.out.println("Length: " + args.length);
        for(String arg : args){
            if(isInteger(arg)){
                System.out.println("Integer: " + arg);
                continue;
            }
            System.out.println("String: " + arg);
        }
    }
}
