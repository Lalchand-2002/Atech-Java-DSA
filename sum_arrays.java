public class sum_arrays {
    public static void main(String[] args) {
        int[] arr = {8,7,3,9,2,1,5};
        int sum =0;
        int mul=1;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            mul = mul*arr[i];

        }
        System.out.println("The sum of the array is: "+sum);
        System.out.println("The multiply of the array is: "+mul);
    }
}
