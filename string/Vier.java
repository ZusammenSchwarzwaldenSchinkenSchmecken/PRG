public class Vier{
    public static void main(String[] args){
        String s = new java.util.Scanner(System.in).nextLine();
        for(int a=0; a<s.length(); a++){
            char x=s.charAt(a);
            System.out.print((char)((x>='a' && x<='z')?x-'a'+'A':x));
        }
        System.out.println();
    }
}
