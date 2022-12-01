//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str="assignment";
        String str1="";
        for(int i=0;i<str.length();i++){
            if(isThereDuplicate(str.charAt(i),str1)) {
                str1 = str1 + str.charAt(i);
            }
        }
        System.out.print(str1);
    }
    static boolean isThereDuplicate(char ch,String str1){
        int numForTrueOrFalse=str1.indexOf(ch);
        if(numForTrueOrFalse==-1){
            return true;
        }else
            return false;
        }
    }
