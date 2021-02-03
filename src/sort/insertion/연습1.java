package sort.insertion;

public class 연습1 {
    public static void main(String[] args) {
        int[] arr=new int[]{5,78,3,1,5,48,5,6,53,45,71,35,7,44};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >=1 ; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
