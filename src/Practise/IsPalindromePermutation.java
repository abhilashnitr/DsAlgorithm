package Practise;

public class IsPalindromePermutation {

   public static boolean isPermutationOfPalindrome(String phrase) {
         int countOdd = 0;
         int[] table =new int[Character.getNumericValue('z')-Character.getNumericValue('a') + 1];
          for (char c :phrase.toCharArray()) {
              int x = Character.getNumericValue(c);
               if (x != -1) {
                   table[x]++;
                   if (table[x] % 2 ==1) {
                       countOdd++;
                       } else {
                       countOdd--;
                       }
                       }
                       }
           return countOdd <= 1;
           }


           public static void main(String[] args){
                //System.out.println(isPermutationOfPalindrome("abacdbc"));

               System.out.println(Math.abs(10));
               System.out.println(Math.abs(-10));
               System.out.println(Math.abs(10.0));
               System.out.println(Math.abs(-10.0));
           }
}
