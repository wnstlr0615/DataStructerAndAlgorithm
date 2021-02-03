package basicinteger;

import java.util.Scanner;

public class 파스칼의삼각형 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n+2][n+2];
        for (int i = 1; i <=n+1 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i==j || j==1){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }

        for (int i = 1; i <=n+1 ; i++) {
            for (int j = 1; j <=n+1 ; j++) {
                System.out.printf("%4d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
