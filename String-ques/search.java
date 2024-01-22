public class search {
    //find character in string
    static int charsearch(String s, char c){
        int cnt=0;
       for (int i=0; i<s.length(); i++){
        if(s.charAt(i)==c){
            System.out.println(i);
            return i;
        }
    }
    return cnt;
}

    
    public static void main(String[] args) {
        String s2=new String("hello");
        String s="hello there";
        charsearch(s, 'o');

        //string literal saves in const. pool
        // string creates new object in nrml heap m/m
        if(s==s2){
            System.out.println("samr");
        }
        else{
            System.out.println("fls");
        }
    }
}
