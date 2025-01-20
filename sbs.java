import java.util.ArrayList;
import java.util.Scanner;

public class sbs {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         ArrayList<Character> al=new ArrayList<>();
         String s=sc.next();
         for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
         }
       
        for(int k=0;k<al.size();k++){
            for(int i=0;i<al.size();i++){
                if(al.get(i)=='A'&&al.get(i+1)=='B'){
                    al.remove(i);
                    al.remove(i);
                    System.out.println(al);
                }
                else if(al.get(i)=='C'&&al.get(i+1)=='D'){
                    al.remove(i);
                    al.remove(i);
                    System.out.println(al);
                }
            }
        }
        
        
    }
}
