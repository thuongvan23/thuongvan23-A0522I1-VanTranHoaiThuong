package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sdt {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String SDT_REGEX= "^[(0-90-9)]+[-]+[(]+[0]+[0-9]{9}+[)]$";

    public Sdt() {
        pattern=Pattern.compile(SDT_REGEX);
    }
    private boolean validate(String regex)  {
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
    private static final String[] phone={"(84)-(0978489648)","(a4)-(0978489648)","(24)-(0978489648)"};

    public static void main(String[] args) {
        Sdt sdt=new Sdt();
        for (String i:phone) {
            boolean is=sdt.validate(i);
            System.out.println("Số điện thoại "+i+" xác nhận "+is);
        }
    }

//    ^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$ Email
//    ^[_a-z0-9]{6,}$ Account
}
