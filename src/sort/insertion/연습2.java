package sort.insertion;

public class 연습2 {
    public static void main(String[] args) {
        int[] arr=new int[]{15,5,4,3,11,3,21,14,8,9,1};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >=1 ; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }
                else{
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
