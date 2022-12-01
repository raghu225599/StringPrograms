//2. WAP to print Duplicates characters from the String.
public class PrintDuplicatesCharactersFromString {
    public static void main(String[] args) {
        String str="assignment";
        String str1="";
        for(int i=0;i<str.length();i++){
            char eachchar=str.charAt(i);
            if(isThereDuplicate(eachchar,str1)==false) {
                System.out.println(eachchar);
            }else{
                str1=str1+eachchar;
            }
        }
    }
    static boolean isThereDuplicate(char ch,String str1){
        int numForTrueOrFalse=str1.indexOf(ch);
        if(numForTrueOrFalse==-1){
            return true;
        }else
            return false;
    }
}
