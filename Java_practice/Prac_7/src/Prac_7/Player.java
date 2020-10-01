package Prac_7;

import java.util.ArrayDeque;

public class Player {
    public String getName() {
        return name;
    }

    String name;
    ArrayDeque<Integer> Cards = new ArrayDeque<Integer>();
    Player(String name, int[] nums){
        this.name = name;
        for(int i =0; i<5; i++){
            Cards.add(nums[i]);
        }
    }

    public void addCard(int Card){
        Cards.add(Card);
    }
    public int extractCard(){
        return Cards.pop();
    }
    public boolean isEmpty(){
        return Cards.isEmpty();
    }


}
