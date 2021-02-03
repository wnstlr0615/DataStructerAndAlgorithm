package basicinteger;

import java.util.Scanner;

public class 에라토스테네스의체 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for (int i = 0; i <n+1 ; i++) {
            arr[i]=i;
        }
        for (int i = 2; i <n+1 ; i++) {
            if(arr[i]!=-1) {
                for (int j = i + 1; j < n + 1; j++) {
                    if (arr[j] % arr[i] == 0) {
                        arr[j] = -1;
                    }
                }
            }
        }
        for (int i = 2; i <n+1 ; i++) {
            if(arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }
    }
}
