public class print extends array1 {
    // reverse print
     static void revPrint(int arr[]){
        System.out.print("[");
        for(int i= arr.length-1; i>=0; i=i-1){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }
    //even element printing
    static void evenprint(int arr[]){
        for(int i=0; i<=arr.length; i=i+2){
            System.out.println(arr[i]+",");
        }
    }
    //2nd largest printing(sort and give 2nd element)
    static int secmax(int arr[]){
        int temp;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }  
        }
        return arr[1];
    }
   public static void main(String[] args) {
    int rev[]= new int[3];
    createArray(3, rev);
    revPrint(rev);
   // evenprint(rev);
    System.out.println(secmax(rev));

    }
}
