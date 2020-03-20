package Practise;

public class String_Util {

    public static boolean isQuique(String str){
        int checker = 0;

        for (int i = 0; i < str.length(); ++i)
        {
            int val = (str.charAt(i)-'a');

            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return false;

            // set bit in checker
            checker |=  (1 << val);
        }

        return true;
    }
   public static char firstDupl(String str){
        int checker = 0;
        char c='\u0000';

        for (int i = 0; i < str.length(); ++i)
        {
            int val = (str.charAt(i)-'a');

            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return str.charAt(i);

            // set bit in checker
            checker |=  (1 << val);
        }

        return c;
    }
    public static void AllDupl(String str){
        int checker = 0;
        char c='\u0000';

        for (int i = 0; i < str.length(); ++i)
        {
            int val = (str.charAt(i)-'a');

            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                System.out.println(str.charAt(i));

            // set bit in checker
            checker |=  (1 << val);
        }

    }
     public static void main(String[] args){
        String str="abcvftyujccc";

         //System.out.println(isQuique(str));
         //System.out.println(firstDupl(str));
         //AllDupl(str);
         char c='c';
         char C='c';
         System.out.println(c==C);


     }
}
