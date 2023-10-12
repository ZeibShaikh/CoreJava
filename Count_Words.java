public class Count_Words {
    public static void main(String[] args) {
        String str="Alfisha Zeib Shaikh";
        int len=str.length();
        int count=1;
        for(int i=0;i<len;i++){
            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}