import java.util.ArrayList;

public class ArrayLi {
    public static void main(String[] args) {
        ArrayList <Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
