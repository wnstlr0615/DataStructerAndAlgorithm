package basicinteger;

import java.util.Scanner;

public class 소인수분해 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 2; n>1 ; ) {
            if(n%i==0){
                n/=i;
                System.out.println(i);
            }
            else{
                i++;
            }
        }
    }
}
