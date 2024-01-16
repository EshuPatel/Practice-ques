import java.util.Scanner;

public class arrcopy {
    //copy all elements from one to another array
    public static void main( String args[]){
        Scanner sc =new Scanner(System.in);
        // enter from user the array to copy
        System.out.println("Size of array");
        int len=sc.nextInt();
       System.out.println("Enter arr to copy from");
       int srcarr[] = new int[len];
        for (int i=0; i<srcarr.length; i++){
            srcarr[i]=sc.nextInt();
    }
    //    enter array to be copied into
    public static void createArr(){
        System.out.println("Size of array");
        int lent=sc.nextInt();
       System.out.println("Enter array");
       int desarr[] = new int[lent];
        int f= desarr.length ;
        for (int i=0; i<f; i++){
            desarr[i]=sc.nextInt();
    }
    }
createArr();

    }}
