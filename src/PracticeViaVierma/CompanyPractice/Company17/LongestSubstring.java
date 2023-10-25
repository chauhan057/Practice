package PracticeViaVierma.CompanyPractice.Company17;
import java.util.HashSet;

class LongestSubstring{
    public static void main(String[] args) {
        String s="aabbcdab";
        int end=0;
        int start =0;
        int max=0;
        HashSet<Character> set =new HashSet<>();
        while (start<s.length()){
            if (!set.contains(s.charAt(start))){
                set.add(s.charAt(start));
                max= Math.max(max, set.size());
                start++;
            }
            else {
                end++;
                start=end;
                set.clear();
            }
        }
        System.out.println(max);
    }
}





/*

class LongestSubstring {
    public static void main(String[] args) {
        String s = "aabbcdab";
        int st = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, set.size());
            } else {
                while (set.contains(c)) {
                    set.remove(s.charAt(st));
                    st++;
                }
                set.add(c);
            }
        }

        System.out.println(max);
    }
}
*/
