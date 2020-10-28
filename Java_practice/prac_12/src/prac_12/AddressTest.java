package prac_12;

public class AddressTest {
    static Address address_1 = new Address("Russia, Moscow region, Moscow, Butlerova, 3, 2, 1");
    static Address address_2 = new Address("Russia, Moscow region, Pushchino, mkr.G, 3, 2, 1");
    static Address address_3 = new Address("Russia, Moscow region. Moscow; Butlerova- 3, 2. 1", ",.;-");
    static Address address_4 = new Address("Russia, Moscow region. Pushchino, mkrG. 3, 2. 1", ",.;-");


    public static void test(){
        System.out.println(address_1.to_String());
        System.out.println(address_2.to_String());
        System.out.println(address_3.to_String());
        System.out.println(address_4.to_String());
    }

}
