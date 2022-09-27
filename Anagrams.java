import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {

        boolean x= true;
        a= a.toLowerCase();
        b=b.toLowerCase();
        if (a.length()!=b.length()){
            x=false;
        }
        

        int al[]=new int [256];

        for(char c : a.toCharArray()){
            int i=(int) c;
            al[i]++;
        }
        for(char c : b.toCharArray()){
            int i=(int) c;
            al[i]--;
        }
        for (int i=0;i<256;i++){
            if(al[i]!=0){
                x=false;
                break;
            }
        }
        return x;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



















