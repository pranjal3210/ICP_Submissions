package Day_4_Problems;
import java.util.Scanner;
public class longest_repeating_character_replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int[] freq=new int[26];
        int left=0;
        int maxfreq=0;
        int maxwindow=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(i)-'A']);
            int window=i-left+1;
            if(window-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            window=i-left+1;
            maxwindow=Math.max(maxwindow,window);
        }
        System.out.print(maxwindow);
    }
}
