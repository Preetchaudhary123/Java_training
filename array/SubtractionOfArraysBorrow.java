package array;
import java.util.*;

public class SubtractionOfArraysBorrow {
    public static int[] subtract(int[] a, int[] b, int n, int m){
        int i = n - 1;
        int j = m - 1;
        boolean borrow = false;
        int size = n > m ? n : m;
        int[] res = new int[size];

        int k = size - 1;

        while(i >= 0 || j >= 0){
            int x = (i >= 0) ? a[i] : 0;
            int y = (j >= 0) ? a[j] : 0;
            if(borrow){
                x--;
            }
            if(x < y){
                res[k] = x + 10 -y;
                borrow = true;
            }else{
                res[k] = x - y;
                borrow = false;
            }
            i--;
            j--;
            k--;
        }
        if(res[0] == 0){
            int[] temp = new int[size - 1];
            for(int l = 0; l < size; l++){
                temp[l] = res[l + 1];
            }
            return temp;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array1: ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        };
        System.out.print("Enter size of array2: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of array2: ");
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(subtract(a, b, n, m)));
        sc.close();
    }
}

