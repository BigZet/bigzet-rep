package Prac_8;

public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        BoundedWaitList<Integer> bwl = new BoundedWaitList<Integer>(capacity);
        UnfairWaitList<Integer> uwl = new UnfairWaitList<Integer>();
        for (int i = 0; i<capacity; i++){
            try{
                uwl.add(i);
                bwl.add(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(bwl.toString());
        System.out.println(uwl.toString());
        bwl.remove(3);
        System.out.println(bwl.toString());
        uwl.moveToBack(3);
        uwl.remove(5);
        System.out.println(uwl.toString());
    }
}
