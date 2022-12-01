//8. WAP to find the maximum occurring character in a String.
public class MaximumOccurringCharacterInAString {
    public static void main(String[] args){
        String str="assignment";
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i);
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            arr[i]=count;
        }
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.print(str.charAt(index));
    }
}
