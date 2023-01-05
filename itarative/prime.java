/*package itarative;

public class prime {
    public static void main(String[] args){
        int num = 8;
        int count=0;
        for(int i=1;i<=num;i++){
            if (num%i==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("its a prime number");
        }else{
            System.out.println("its not a prime number");
        }
    }
}*/



package itarative;

public class prime{
    public static void main(String[] args){
        for (int i=2;i<=100;i++){
            boolean isprime = true;

            for(int j=2; j<i ;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.print( i +" , ");
            }
        }
    }
} 

