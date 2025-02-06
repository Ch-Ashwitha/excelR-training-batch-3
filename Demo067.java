class Demo067{
    public static void main(String[] args) {
        int[] arr = {22,11,33,55,44,77,66};
        System.out.print("Elements at even index position are: ");
        for(int i = 2; i<arr.length;i+=2){
            System.out.print(arr[i]+",");
        }
    }
}
