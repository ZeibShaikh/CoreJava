import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicate_Ele {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        boolean flag=false;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j< arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    System.out.println("Dulicate element found "+arr1[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Duplicate element not found");
        }


    }
}
