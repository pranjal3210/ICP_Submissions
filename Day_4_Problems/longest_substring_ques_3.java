package Day_4_Problems;
import java.util.*;
public class longest_substring_ques_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int max=0;
        HashSet<Character> charset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(charset.contains(s.charAt(i))){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        System.out.print(max);
    }
}
