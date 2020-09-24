package Lab_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class CollectionApp {

    void printC(Collection<Integer> clt, String name){
        System.out.printf("Elements of %s collection %d\n", name, clt.size());
        for (Integer i:clt) {
            System.out.printf("%d, ", i);
        }
        System.out.println();

    }

    CollectionApp(){
        ArrayList<Integer> mArr = new ArrayList<Integer>();
        LinkedList<Integer> mList = new LinkedList<Integer>();
        MyArr<Integer> myArr = new MyArr<Integer>();
        Random r = new Random();
        for(int i =0; i<20; i++){
            mArr.add(r.nextInt(20));
            mList.addFirst(r.nextInt(20));
            myArr.append(r.nextInt(20));
        }
        printC(mArr, "ArrayList");
        printC(mList, "LinkedList");
        printC(myArr, "MyArr");
    }
}
