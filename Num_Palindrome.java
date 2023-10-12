public class Num_Palindrome {
    public static void main(String[] args) {
        int num=123321;
        int comp=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==comp){
            System.out.println("Its is a palindrome");
        }
        else{
            System.out.println("The Number is not a palindrome");
        }
    }
}
