import java.util.*;
public class Drei{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char x = 's';
        char y = 'S';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x||s.charAt(i)==y){
                System.out.print(i+" ");
            }
        }
    }
}
