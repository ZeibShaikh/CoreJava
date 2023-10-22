public class Occurance {
    public static void main(String[] args) {
        String str="Java is the best programming language";
//        int length=str.length();
//        int oc=str.replaceAll("a","").length();
//        int count=length-oc;
//        System.out.println(count);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
