package PracticeViaVierma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRepicateWord {
    public static void main(String[] args) {
        Pattern p =Pattern.compile("is");
        Matcher m =p.matcher("This is is Vishal Chauhan");
        while (m.find()){
            System.out.println(m.group()+" ..."+ m.start());
        }
    }
}
