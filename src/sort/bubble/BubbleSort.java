package sort.bubble;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,8,6,2,1,6,11,1,21,54,35};
        for (int i = 0 ;i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
