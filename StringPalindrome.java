//3. WAP to check if “2552” is palindrome or not.
public class StringPalindrome {
    public static void main(String[] args) {
        String num="2552";
        StringBuilder anotherNum=new StringBuilder();
        for(int i=num.length()-1;i>=0;i--){
            anotherNum=anotherNum.append(num.charAt(i));
        }
        if(num.contentEquals(anotherNum)){
            System.out.println(anotherNum+" is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
