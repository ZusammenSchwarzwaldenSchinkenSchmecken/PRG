import java.util.*;
public class Zwei{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        for(int i=0;i<r.length();i=i+3){
            System.out.print(r.charAt(i));
        }
        System.out.println();
    }
}
