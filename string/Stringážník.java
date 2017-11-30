/**
 * Třída {@code String} je hlavní třídou projektu,
 * který ...
 *
 * @author    Véna Krocíř
 * @version   1.00.000
 */
public class Stringážník{
    public static void main(String[] args){
        String a = "ahoj";
        String b = "ahoi";
        String c = "Ahoj";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));    //výpis porovnání
        System.out.println(b.compareTo(c));
        System.out.println();
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.compareToIgnoreCase(c));   //výpis porovnání
        System.out.println(b.compareToIgnoreCase(c));
        System.out.println();
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));    //výpis porovnání
        System.out.println(b.equals(c));
        System.out.println();
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));  //výpis porovnání
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println();
        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());  //výpis s malými znaky
        System.out.println(c.toLowerCase());
        System.out.println();
        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());  //výpis s CAPSLOCKEM
        System.out.println(c.toUpperCase());
        System.out.println();
        System.out.println(a.concat(b));
        System.out.println(a.concat(c));  //výpis spojených stringážníků
        System.out.println(b.concat(c));
        String something = "cacao";
        System.out.println();
        System.out.println(something);
        System.out.println("|");
        System.out.println("|");            //výměna písmenek
        System.out.println("ˇ");
        System.out.println(something.replace('c', 'k'));
        String ustav = "VOŠ a SPŠE Plzeň";
        System.out.println();
        System.out.println(ustav);
        System.out.println(ustav.substring(6,16));            //ztrácení písmenek
        System.out.println(ustav.substring(6,10));
        String citat = "s programováním nejdřív pojdeš";
        System.out.println(citat);
        System.out.println(citat.startsWith("s "));
        System.out.println(citat.endsWith("jdeš"));            //kontrola začátku a konce
        System.out.println(citat.endsWith("jde"));
        String mezerniky = "          BlueJ IDE          ";
        System.out.println(mezerniky.trim());               //ořezání bílých znaků
        String skill = "programování je zábava";
        System.out.println(skill.charAt(5));                //získání znaku
    }
}
