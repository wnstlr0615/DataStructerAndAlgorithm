package sort.bubble;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 연습2 {
    public static void main(String[] args) {
        int[] arr= IntStream.rangeClosed(90, 20).toArray();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
