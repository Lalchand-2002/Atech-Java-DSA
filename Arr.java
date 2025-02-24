import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr;
        int[] arr2={2,6,8,9,4,5,1}; //Array initialization with values
        arr = new int[5];
        arr[0]=5;
        arr[1]=1;
        arr[3]=6;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3]);//only print index/one values
    }
}
