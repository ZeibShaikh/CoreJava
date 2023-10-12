public class Missing_Ele {
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        int arrSum=0;
        int norm=0;
        for(int i=0;i<arr.length;i++){
            arrSum=arrSum+arr[i];
        }
        int len=arr.length;
        for(int i=1;i<=5;i++){
            norm=norm+i;
        }
        int missing=norm-arrSum;
        System.out.println(missing);
    }
}
