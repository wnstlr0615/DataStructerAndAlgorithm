package basicinteger;

import java.util.Scanner;

public class 유클리드호제법 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int gcd=gcd(a,b);
        int lcm=lcm(a, b);
        System.out.println("gcd : "+gcd+" lcd : "+lcm(a,b));

    }
    public static int gcd(int a, int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        return a%b==0 ? b :gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        return a *b/gcd(a,b);
    }
}

