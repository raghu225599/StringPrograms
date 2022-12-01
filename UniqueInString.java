//7. WAP to find if String contains all unique characters.
public class UniqueInString {
    public static void main(String[] args){
        String str="Assignment";
        String str2="rmagpjuyi";
        int flag=0;
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(containsCharacter(ch,str1)){
                flag=1;
                System.out.println("given string does not contain unique characters");
                break;
            }else{
                str1.append(ch);
            }
        }
        if(flag==0){
            System.out.println("given string contains unique characters");
        }
    }
    public static boolean containsCharacter(char ch,StringBuilder str1){
        for(int i=0;i< str1.length();i++){
            if(str1.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
