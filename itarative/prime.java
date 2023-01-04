package itarative;

public class prime {
    public static void main(String[] args){
        int n=103;
        int count =0;
        if(n>1)
        {
           for(int i=1;i<=0;i++)
           {
            if(n%i==0)
         count++;
         
        }
        if (count==2){
            System.out.println(" prime");
        }else{
            System.out.println("not prime");
        }
        }
        else{
            System.out.println("the num is prime");
        }
      
    
    }
}
