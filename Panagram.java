//6. WAP to implement Pangram Checking with the least inbuilt methods being used.
public class Panagram {
    public static void main(String[] args){
        String panagramName="The Quick Brown Fox Jumps Over The Lazy Dog";
        String string=panagramName.replace(" ","");
        int flag=0;
        for(char ch='a',chcap='A';ch<='z'&chcap<='Z';ch++,chcap++){
            if(!containsCharacterIn(ch,string,chcap)){
                flag=1;
                System.out.println("Given PanagramName is not a Panagram");
                break;
            }
        }
        if(flag==0)
            System.out.println("Given PanagramName is a Panagram");
    }
    public static boolean containsCharacterIn(char ch,String name,char ch1){
        if(name.indexOf(ch)==-1&&name.indexOf(ch1)==-1){
            return false;
        }else{
            return true;
        }
    }
}
