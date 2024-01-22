import java.util.*;
public class Strings1 {

    static void concate(String s1, String s2){
        char[] c1 =s1.toCharArray();
        char[] c2= s2.toCharArray();
        String s3="";
        for (int i=0; i<c1.length; i++){
            s3=s3+c1[i];
        }
        for (int i=0; i<c2.length; i++){
            s3=s3+c2[i];
        }
        System.out.println(s3);
    }

    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String e1,e2;
        e1=sc.nextLine();
        System.out.println("enter string2");
        e2=sc.nextLine();
        // concate(e1, e2);

        StringJoiner s = new StringJoiner(", ","hi", "guy");  

        String e3= new String("Hello");   
        String s2 = new String(" World");    
        String s1 = String.format("%s%s%s",e1,e2,e3);   
        System.out.println(s1.toString());

        
    }
    }
    

