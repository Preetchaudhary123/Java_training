package demomo;
import java.util.*;

public class jk {
    public static void main(String[] args) {
//        byte b1 = 127;
//        ++b1;
//        System.out.println(b1);
//        byte b3 = b1 + 3; // error ayega isme kyuki byte ko hum integer se add nahi kar sakte h
//        System.out.println(b3);
//        final byte b2 = 10; // final keyword use kiya h taki jvm usko integer se confuse na kare. Ab jvm esa kyu karta h vo pata nahi bas karta h
//        final byte b3 = 20;
//        byte b4 = b2+ b3;
//        System.out.println(b4);

        Scanner sc = new Scanner(System.in);

// ------------------------------- LOOPS ---------------------------------------
//
//        for(int i = 0; i <= 20; i++){
//            if(i%3==0) System.out.println(i);
//        }
//
//
        System.out.print("Enter a number 3-4 digit number:");
        int num1 = sc.nextInt();
        int sum = 0;

        for(; num1 !=0 ; num1/=10){
            sum += num1 % 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
