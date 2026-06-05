package demomo;
import java.util.*;
public class kes {
    static int multiplication(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//     ------------------Euclidean's Algorithm (GCD/HCF)---------------

//        int max = 60;
//        int min = 18;
//        while(min != 0){
//            int rem = max % min;
//            max = min;
//            min = rem;
//        }
//        System.out.println(max);

//    --------------------PATTERN'S---------------------------------
//    ---------------PRINTING 00 01 02 10 11 12 etc. -----------------
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(i + "" + j + " ");
////                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.print(" ");
//        }
//
//        ------RIGHT ANGLE ULTA-----------------

//        for(int i = n; i > 0; i--){
//            for(int j = i; j > 0; j--){
//                System.out.print("* " );
//            }
//            System.out.println();
//        }

//        System.out.println(multiplication(2, 4));

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        for (int i = 1; i <= max; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(* + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = max - 1; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(* + " ");
//            }
//            System.out.println();
//        }

//-------------------------------------------------------------------------------
// ----------------PYRAMID--------------------------------
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        ----------------------REVERSE PYRAMID--------------------------------

//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

//        ----------------DIAMOND--------------------------------
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        
    }
}