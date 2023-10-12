public class White_Space {
    public static void main(String[] args) {
        String abc="          White Spaces               ";
        abc=abc.replaceAll("\\s","");
        System.out.println(abc);
    }
}
