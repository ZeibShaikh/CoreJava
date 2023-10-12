public class Special_Char {
    public static void main(String[] args) {
        String abc="@#$%^*!@Zeib Shaikh@#$!%&^%&";
        abc=abc.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(abc);
    }
}
