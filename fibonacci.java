package deko;
import java.util.*;

// --------------------------FIBONACCI USING RECURSION------------------------------------

public class fibonacci {
    static int fib(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        while(n > 0){
            return fib(n-1) + fib(n-2);
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//  -------------------FIBONACCI NUMBER AT A POSITION ---------------------

        System.out.print("Fibonacci number at position: ");
        int num1 = sc.nextInt();
        System.out.println("Fibonacci number: " + fib(num1));

        for(int i = 0; i <= num1; i++){
            System.out.println(fib(i));
        }


    }
}
