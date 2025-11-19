package Day_4_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class permutation_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int s1count[]=new int[26];
        int s2count[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            s1count[ch-'a']++;
        }int flag=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            s2count[ch-'a']++;
            if(i>=s1.length()){
                s2count[s2.charAt(i-s1.length())-'a']--;
            }
            if(Arrays.equals(s1count,s2count)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
        
    }
}
