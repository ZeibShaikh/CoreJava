public class Even_Odd {
    public static void main(String[] args) {
        int num=123456;
        int even_Count=0;
        int odd_Count=0;
        while(num>0){
            if(num%2==0){
                even_Count++;
            }
            else{
                odd_Count++;
            }
            num=num/10;
        }
        System.out.println(even_Count);
        System.out.println(odd_Count);
    }
}
