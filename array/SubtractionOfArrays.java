// Subtraction of arrays

import java.util.Arrays;
import java.util.Scanner;

public class SubtractionOfArrays{

    public static String subtraction(int[] a, int[] b, int n, int m){
        int num1 = 0;
        for(int i : a){
            num1 = num1 * 10 + i;
        }

        int num2 = 0;
        for(int i : b){
            num2 = num2 * 10 + i;
        }

        int sub = num1 - num2;
        int size = n > m ? n : m;
        int[] res = new int[size];
        for(int i = size - 1; i >= 0; i--){
            res[i] = sub % 10;
            sub /= 10;
        }
        return Arrays.toString(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array1:");
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of array2: ");
        int m = sc.nextInt();
        System.out.print("Enter elements of array2:");
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(subtraction(arr1, arr2, n, m));
        sc.close();
    }
}