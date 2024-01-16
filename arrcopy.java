import java.util.Scanner;

public class arrcopy extends array1 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size of array");
    int len=sc.nextInt();
    int cpyfrm[]= new int[len];
    createArray(len, cpyfrm);
    printArr(cpyfrm);
    int cpyto[]= new int[len];
    for (int i=0; i<len; i++){
        cpyto[i]=cpyfrm[i];
    }
    printArr(cpyto);
sc.close();
}
}
