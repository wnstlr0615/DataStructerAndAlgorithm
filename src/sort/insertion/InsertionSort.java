package sort.insertion;
/*
* 삽입 정렬
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,8,9,1,3,5,7,9,12,5,48,22};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >=1; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
