import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int temp=0;
        int left=0;
        int right= arr.length -1;
        System.out.println("Original array is: "+ Arrays.toString(arr));

        while (left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse array is: "+Arrays.toString(arr));

    }
}
