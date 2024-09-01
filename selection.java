public class selection {

    public static void main(String[] args) {
        int array[]={5,6,3,2,7,1,4};

        for(int i=0;i<array.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<array.length;j++){
                if (array[smallest]>array[j]) {
                   smallest=j;
                }
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}