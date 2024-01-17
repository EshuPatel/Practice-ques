public class deletion extends array1 {
    
    //deletion by value
    public static void endel(int arr[], int val){
        //int tmp[]= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]==val){
                for (int j=i; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }

            }}
        }
    
        // deletion b
    public static void main(String[] args) {
        int you[]={1,2,3,4,5,6,7};
        endel(you, 4);
        printArr(you);
    }
}

