package conditional;

public class great3 {

   
    public static void main(String[] args){
      int a=20;
      int b=30;
      int c=40;
      
      switch (a>b||b>c||c>a){
        case 10:System.out.println("10");
        break;
        case 20:System.out.println("20");
        break;
        case 30:System.out.println("30");
        break;
        default:System.out.println("not 10,20,30");

      }

    }
    
}
