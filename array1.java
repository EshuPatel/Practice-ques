import java.util.Scanner;
class array1{
    
    public static void main(String[] args){

        //single dimension array
        //creation
        // public void createArray(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int f= arr.length ;
        for (int i=0; i<f; i++){
            arr[i]=sc.nextInt();
        }
    
        //access elements
        System.out.print("[");
        for (int i=0; i<f; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");

        //change arr element

        System.out.println("Enter index you want to chng");
        int trm= sc.nextInt();
        System.out.println("Enter value to be now");
        int val= sc.nextInt();
        arr[trm]=val;

        //for-each loop use to access elements
        for (int i: arr){       //i will access each value separately
            System.out.println(i);
        }
        
        //passing array to mthd
        // public static void mini(int array[]){
        //     int m=array[0];
        //     for (int i: array){
        //         if (i<m){
        //             m=i;
        //         }
        //     }
        //     System.out.println(m);
        // }
        // min(arr);

         
              


        



sc.close();
    }
}
