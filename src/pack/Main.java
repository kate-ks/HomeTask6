package pack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList animals = new Zoo();

        animals.add(0,"lion");
        animals.add(1,"wolf");
        animals.add(2,"eagle");
        animals.add(3,"fox");
        animals.add(4,"bear");
        animals.add(5,"snake");
        animals.add(6,"horse");
        animals.add(7,"tiger");

        for (int i=0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

        animals.remove(7);
        animals.remove(3);
        animals.remove(5);

        System.out.println(animals.size());
    }
}
