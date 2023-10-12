public class String_Count {
    public static void main(String[] args) {
        String str="Zeib Arif Shaikh";
//        int count=0;
//        str=str.replaceAll(" ","");
//        for(int i=0;i<str.length();i++){
//            count++;
//        }
//        System.out.println(count);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
