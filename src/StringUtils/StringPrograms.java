package StringUtils;

import java.util.Arrays;

public class StringPrograms {

    public void MaxOccuringChar(String str){

    }

    public static String removeDup(String str){

        char[] ch=str.toCharArray();
        int k=0;
        int counter=0;
        for(int i=0;i<str.length();i++){
            int bit=str.charAt(i)-'a';
            if((counter&(1<<bit))==0){
                ch[k++]=str.charAt(i);
            }
            counter=counter|(1<<bit);
        }

        str=String.valueOf(ch);
        str=str.substring(0,k);

        return str;
    }

    public static void  printDuplicate(String str){
        int counter=0;
        for(int i=0;i<str.length();i++){
            int bit=str.charAt(i)-'a';
            if((counter&(1<<bit))>0){
                System.out.println(str.charAt(i));
            }
            counter=counter|(1<<bit);
        }
    }


}
