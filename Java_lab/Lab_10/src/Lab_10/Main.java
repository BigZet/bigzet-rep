package Lab_10;


import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {

    public static <E> ArrayList<E> ArrayToArrayList(E[] a){
        ArrayList<E> lst = new ArrayList<>();
        for(E o:a) lst.add(o);
        return lst;
    }
    public static void main(String[] args) {
        AnyArray anyArray = new AnyArray();
        anyArray.add("New");
        anyArray.add(10);
        CatalogList CL = new CatalogList("..");
        System.out.println(CL.to_String());
        //System.out.println(CL.get(1));
        ArrayList<Integer> tst = Solution.newArrayList (new Integer(10), new Integer(20));
    }
}
