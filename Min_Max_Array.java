public class Min_Max_Array {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int min=arr1[0];
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }

        }
        System.out.println(max);
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]<min){
                min=arr1[i];
            }
        }
        System.out.println(min);
    }
}
