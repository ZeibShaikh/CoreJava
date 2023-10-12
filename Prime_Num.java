public class Prime_Num {
    static void checkPrime(int n){
        boolean flag=false;
        if(n<=1){
            System.out.println();
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its not a prime number");
        }
    }
    public static void main(String[] args) {
        checkPrime(17);
    }
}
