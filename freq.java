public class freq extends array1 {

    public static void countfreq(int arr[]){
        // 1- create temp with cnt freq
        int temp[] = new int[arr.length];
        int count=0;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                    temp[i]=count;}
            }}
        printArr(temp);
        }
        public static void main(String[] args) {
            countfreq(new int[]{1,2,2,3});
        }
    }
    

