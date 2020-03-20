package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    static class Rank implements Comparable<Rank>{
        int i;
        Rank(int i){
            this.i=i;
        }

        @Override
        public String toString() {
            return "Rank{" +
                    "i=" + i +
                    '}';
        }

        @Override
        public int compareTo(Rank o) {
            return o.i-this.i;
        }
    }

    public static void main(String[] args){
        Rank r1=new Rank(5);
        Rank r2=new Rank(3);
        Rank r3=new Rank(7);
        Rank r4=new Rank(2);
        Rank r5=new Rank(10);

        List<Rank> list=new ArrayList<Rank>();
        list.add(r1);
        boolean add = list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r5);
        Collections.sort(list);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(3);
        al.add(10);
        al.add(13);
        al.add(1);

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + list);
    }
}
