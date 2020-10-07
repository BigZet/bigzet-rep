package Lab_10;

public class Main {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 6, 44, 323, 6};
        NArr<Integer> nArr= new NArr<Integer>(n);
        nArr.add(666);
        nArr.to_String();
    }
}
