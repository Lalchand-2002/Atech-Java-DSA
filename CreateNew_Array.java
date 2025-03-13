import java.util.Arrays;

public class CreateNew_Array {
    public static void main(String[] args) {
        int[] arr1={1,2,6,8};
        int[] arr2={2,5,7,9};
        int[] Sumarr3= new int[4];
        System.out.println("Array1: "+Arrays.toString(arr1));
        System.out.println("Array2: "+Arrays.toString(arr2));

        for(int i=0;i<Sumarr3.length;i++){
            Sumarr3[i]=arr1[i]+arr2[i];

        }
        System.out.println("Create new Array sum of arr1 and arr2: "+Arrays.toString(Sumarr3));
    }
}
