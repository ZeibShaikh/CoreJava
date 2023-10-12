import java.util.Arrays;

public class Equal_Array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7   };
        int arr2[]={1,2,3,4,5,6};
        if(Arrays.equals(arr1,arr2)==true) {
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
