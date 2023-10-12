public class Occurance_String {
    public static void main(String[] args) {
        String a="Java is the best programming language";
        int count=0;
        int length=a.length();
        int aa=a.replace("a","").length();
        count=length-aa;
        System.out.println(count);
    }
}
