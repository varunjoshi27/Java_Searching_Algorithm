public class insertion {

    public static void Insertionsort(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
public static void main(String[] args) {
    int array[]={3,2,1,4,5};

  // For insertion sort

  for(int i=0;i<array.length;i++){
    int current=array[i];
    int previous=i-1;
    while (previous>=0 && current< array[previous]) {

        array[previous+1]= array[previous];
        previous--;
        
    }
    array[previous+1]=current;
  }

 Insertionsort(array);
}
    
}