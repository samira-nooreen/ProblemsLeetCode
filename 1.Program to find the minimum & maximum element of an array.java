// Program to find the minimum & maximum element of an array

public class MaxAndMinElementsinArray  {
    public static void main(String[] args) {
        int a[] = {50,30,40,50,60,90};
        
        int max= a[0];
        for(int i = 1 ; i < a.length ; i++ )
        {
            if(a[i] > max){
            max = a[i];
            }
        }
        System.out.println("Maximum : " +max);
        
        int min = a[0];
        for(int i = 1 ; i < a.length ; i++){
            if( a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum : " +min);
    }
}
