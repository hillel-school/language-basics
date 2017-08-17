package com.hillel.language.basis14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStringBuffer {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("cat");
        Matcher m = p.matcher("one cat two cats in the yard");
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "unicorn");
        }
        m.appendTail(sb);

        String s = "one cat two cats in the yard".replace("cat", "unicorn");
        System.out.println(s);
        System.out.println(sb.toString());
    }
}
