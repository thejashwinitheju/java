// Reverse a string

public class itarative{
    public static void main(String[] args){
        String str ="abcd";
        String rev ="";
        int length = str.length();
        for(int i=length-1;i>=0;i--)
        {
          rev=rev+ str.charAt(i);
        }
        System.out.println("Reversed string:" +rev);
    }
}
