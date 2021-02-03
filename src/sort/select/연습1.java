package sort.select;

public class 연습1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,4,8,79,2,1,5,66,154,23,47};

        for (int i = 0; i <arr.length ; i++) {
            int minIdx=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
