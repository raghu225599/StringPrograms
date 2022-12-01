//5. WAP to implement Anagram Checking least inbuilt methods being used.
public class Anagram {
    public static void main(String[] args){
        String str1="Race";
        String str2="caRe";
        int flag=0;
        for(int i=0;i<str1.length();i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch)!=-1){
            }
            else{
                flag=1;
                System.out.println(str1+" "+str2+"These Given Two Strings are Not Anagram");
                break;
            }
        }
        if(flag==0) {
            System.out.println(str1 + " " + str2 + " " + "These Given two Stings are Anagram");
        }
    }
}
