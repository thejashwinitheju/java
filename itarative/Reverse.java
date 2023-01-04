package itarative;
public class Reverse {
    public static void main(String args []){
        String Str = "ABCD";
        String Rev = "";
        int Length = Str.length();
        for( int i = Length-1 ; i>=0 ; i--){
            Rev = Rev + Str.charAt(i);
        }
        System.out.println(Rev);
    }
}
