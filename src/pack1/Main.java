package pack1;

import java.util.ArrayList;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(6);
        num.add(8);

        ListIterator<Integer> list= num.listIterator();

        while (list.hasNext()){
            list.set(list.next()+1);
        }

        System.out.println(num);
    }


}
