package Prac_7;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Game {
    protected int game_num = 106;
    Player person_1 = new Player("Jack", new int[]{1, 2, 7, 4, 9});
    Player person_2 = new Player("Wolf", new int[]{3, 8, 5, 6, 11});

    public Game(){
        while(game_num>0 && !person_1.isEmpty() &&!person_2.isEmpty()){
            int Card_1=person_1.extractCard();
            int Card_2=person_2.extractCard();
            System.out.println(String.format("%s card is %d", person_1.getName(), Card_1));
            System.out.println(String.format("%s card is %d", person_2.getName(), Card_2));
            if (Card_1<Card_2){
                person_1.addCard(Card_1);
                person_1.addCard(Card_2);
                System.out.println(String.format("%s take cards", person_1.getName()));
            }
            else {
                person_2.addCard(Card_1);
                person_2.addCard(Card_2);
                System.out.println(String.format("%s take cards", person_2.getName()));
            }
        }

        if (game_num==0){
            System.out.println("botva");
        }
        else if(person_2.isEmpty()){
            System.out.println(person_1.getName()+" win");
        }
        else {
            System.out.println(person_2.getName()+" win");
        }
    }

}
