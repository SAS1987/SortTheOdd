import java.util.Arrays;


class Solution{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 1, 8, 0 })));
        System.out.println(Arrays.toString(sortArray(new int[]{})));
    }

    public static int[] sortArray(int[] array) {
        for(int i=0 ; i<array.length-1 ; i++){
            for(int j=i+1; j<array.length ; j++){
                if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }


}