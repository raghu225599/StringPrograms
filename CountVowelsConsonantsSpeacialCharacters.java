//4. WAP to count the number of consonants, vowels, special characters in a String.
public class CountVowelsConsonantsSpeacialCharacters {
    public static void main(String[] args){
        String email="co#mpan$y@gmail.com";
        int vowelCount=0;
        int consonantCount=0;
        int specialCharacterCount=0;
        for(int i=0;i<email.length();i++){
            char ch=email.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
            else if(ch=='~'||ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch==','||ch=='.'||ch=='/'||ch=='%'||ch=='^'||ch=='&'||ch=='('||ch==')'||ch==';'||ch=='?'||ch==':'){
                specialCharacterCount++;
            }
            else{
                consonantCount++;
            }
        }
        System.out.println(vowelCount+"\n"+consonantCount+"\n"+specialCharacterCount);
    }
}
