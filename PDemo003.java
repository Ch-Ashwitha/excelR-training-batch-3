class PDemo003{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 9;
        int num3 = 8;
        if(num1>num2 && num1>num3)
            System.out.println(num1 + " is greater among all");
        else if(num2>num1 && num2>num3)
            System.out.println(num2 + " is greater among all");
        else
            System.out.println(num3 + " is greater among all");
    }
}