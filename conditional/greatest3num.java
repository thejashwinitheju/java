import java.util.Scanner;
  public class greatest3num{
    public static void main(String[] args){
    int x,y,z;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the first number");
  x=s.nextInt();
  System.out.println("enter the second number");
  y=s.nextInt();
  System.out.println("enter the third number");
  z=s.nextInt();
    if (x>y&&x>z){
      System.out.println("largest number is:+x");
    }else if (y>z){
      System.out.println("largest number is:+y");
    }else{
      System.out.println("largest number is:+z");
    }
    }
  }