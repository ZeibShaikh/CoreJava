public class Swap_Num {
    public static void main(String[] args) {
        int a=10,b=20;
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("Value of a is "+a+" & Value of B is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a is "+a+" & Value of B is "+b);

    }
}
