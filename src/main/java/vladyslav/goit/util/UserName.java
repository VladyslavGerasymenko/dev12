package vladyslav.goit.util;

public class UserName {

    public static String userName(String name){
        String un = name.trim();
        if (un.isEmpty()){
            return "Anon";
        }else{
            return un;
        }
    }
}
