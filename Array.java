package cww513;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] output = transform(arr);
        printArray(output);
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
        System.out.println(toString(arr));
    }
    private static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i <arr.length ; i++) {
            ret+=arr[i];
            if(i!=arr.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return  ret;
    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static int[] transform(int[] arr) {
        int [] ret = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ret[i] = arr[i] * 4;
        }
        return  ret;
    }
     public boolean hasAlternatingBits(int n){
        n^=(n>>1);
        return (n & (n+1))==0;
     }
}
