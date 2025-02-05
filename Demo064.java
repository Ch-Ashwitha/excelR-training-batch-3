import java.util.*;
class Demo064{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int temp;
        temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        System.out.println("Array after swapping: "+ Arrays.toString(arr) );
    }
}