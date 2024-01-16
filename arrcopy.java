import java.util.Scanner;

public class arrcopy {
    // copy elements
public static void createArr(int size){
    Scanner sc= new Scanner(System.in);
    int arr[]= new int[size];
    for (int i=0; i<size; i++){
        System.out.print("enter elem");
        arr[i]=sc.nextInt();
    }
    
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size of array");
    int len=sc.nextInt();
    int cpyfrm[]= new int[len];
    createArr(len);
    




}


