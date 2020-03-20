import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int solution(String S) {
        // write your code in Java SE 8
        int NoOfRep=0;
        int j=0;
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i+1)==S.charAt(i)){
                j++;
            }
            else if(S.charAt(i+1)!=S.charAt(i)){
                if(j>=2){
                    NoOfRep=NoOfRep+j/3;
                }
                j=0;
            }
        }
        if(j>=2){
            NoOfRep=NoOfRep+j/3;
        }

        return NoOfRep;

    }

    static void printUnique(int l, int r) {
        // Start traversing the numbers
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean visited[] = new boolean[10];

            // Find digits and maintain its hash
            while (num != 0) {
                // if a digit occcurs more than 1 time
                // then break
                if (visited[num % 10])
                    break;

                visited[num % 10] = true;

                num = num / 10;
            }

            // num will be 0 only when above loop
            // doesn't get break that means the
            // number is unique so print it.
            if (num == 0)
                System.out.print(i + " ");
        }
    }
        public static void main(String[] args) {
        //printUnique(10,20);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
            System.out.println(list.size());

            changeList(list);
            System.out.println(list.size());
            //System.out.println(solution("baaabbababbba"));
    }

    private static void changeList(ArrayList<Integer> list) {
        list.remove(2);

    }
}
