package treeUtils;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(30);
        list.add(41);
        list.add(45);
        for(int i=0;i<list.size();i++){
            list.add(i,list.get(i)/10);
        }
        list.forEach(e-> System.out.println(e));

    }


}
