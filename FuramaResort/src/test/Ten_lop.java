package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ten_lop {
    private static Pattern pattern;
    private Matcher matcher;
//    private static final String CLASSNAME_REGEX="^[ACP]+[0-9]+[0-9]+[0-9]+[0-9]+[GHIKLM]$";
//    private static final String CLASSNAME_REGEX="^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
        private static final String CLASSNAME_REGEX="^[1-31-9]+[0-9]+[0-9]+[0-9]+[0-9]+[GHIKLM]$";
    public Ten_lop() {
        pattern=Pattern.compile(CLASSNAME_REGEX);
    }
    public boolean vaildate(String regex) {
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
//    private static final String[] classname={"C0318G","M0318G", "P0323A","C09*0G","A0987M"};
private static final String[] classname={"33-15-2022","32/11/2022", "12/13/2022","12/11/0000","12/11/2022","12//12/2111"};

    public static void main(String[] args) {
        Ten_lop ten_lop=new Ten_lop();
        for (String i:classname) {
            boolean is=ten_lop.vaildate(i);
            System.out.println("Class name is "+i+" is vali "+is);
        }
    }
}
