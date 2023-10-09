package PracticeViaVierma.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpecialCharacter {
    public static void main(String[] args) {
        String str="This@is#Vishal%Chauhan*";
        String speChar="[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)]";
        String replace= " ";
        Pattern p =Pattern.compile(speChar);
        Matcher m = p.matcher(str);
        str=m.replaceAll(replace);
        System.out.println(str);
    }
}
