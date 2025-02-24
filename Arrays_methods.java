import java.util.Arrays;

public class Arrays_methods {
    public static void main(String[] args) {
        //Arrays.toString()
      int[] num ={1,3,2,4,6,8,9,19};
        System.out.println(Arrays.toString(num));

        //Arrays.sort()
        int[] num1 ={4,7,90,6,98,10,30};
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));

        //arrays.fill()
        int[] num2 = new int[6];
        Arrays.fill(num2,10);
        System.out.println(Arrays.toString(num2));

        //Arrays.copyof()
        int[] arr={8,9,10,30,29,39,3,4,6};
        int[] copied = Arrays.copyOf(arr,4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copied));

        //Arrays.copyofRange()
        int[] arr1 ={8,9,6,5,7,71,12,3,1};
        int[] copied1 = Arrays.copyOfRange(arr1,3,7);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(copied1));
    }
}
