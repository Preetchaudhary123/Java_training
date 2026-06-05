package deko;

import java.util.*;

public class kera {

// ----------------------DECIMAL TO BINARY----------------------

    static int decimalToBinary(int decimal){
        int binary = 0;
        int place = 1;

        while(decimal > 0){
            int rem = decimal % 2;
            binary = binary + rem * place;
            place = place * 10;
            decimal = decimal / 2;

        }
        return binary;
    }

// ----------------------BINARY TO DECIMAL----------------------
//    static int binaryToDecimal(String binary){
//        int decimal = 0;
//        int place = 1;
//
//        while (binary > 0){
//            int dig = binary % 10;
//            decimal = decimal + dig * place;
//
//        }
//    }

// --------------------DECIMAL TO HEXADECIMAL-----------------------

//    public static String DecimalToHexaDecimal(int decimal, int targetBase){
//        if(decimal == '0'){
//            return 0;
//        }
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int result = sc.nextInt();
        System.out.println(decimalToBinary(result));

//        System.out.print("Enter binary number: ");
//        int result1 = sc.nextInt();
//        System.out.println(binaryToDecimal(result1));
    }
}
