public class Fibo {
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
