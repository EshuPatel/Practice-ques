import java.util.Scanner;
class array1{

    // creation
    public static void createArray(int size, int arr[]){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }

    // printing array
    public static void printArr(int arr[]){
    System.out.print("[");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        createArray(5,arr1);
        printArr(arr1);


        System.out.println("Enter index you want to chng");
        int trm= sc.nextInt();
        System.out.println("Enter value to be now");
        int val= sc.nextInt();
        arr1[trm]=val;

        //for-each loop use to access elements
        for (int i: arr1){       //i will access each value separately
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
