package sort.select;
/*
* 최소값을 앞으로 이동 시킴
* */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,8,7,9,1,25,4,8,4,3,2,5,8,9};
            for (int i = 0; i < arr.length-1; i++) {
                int minIdx=i;
                for (int j = i+1; j <arr.length ; j++) {
                    if(arr[j]<arr[minIdx] ){
                        minIdx=j;
                    }
                }
                int temp=arr[minIdx];
                arr[minIdx]=arr[i];
                arr[i]=temp;
            }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
