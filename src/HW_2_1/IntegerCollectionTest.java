package HW_2_1;

/**
 * Created by denis on 04.06.2017.
 */

public class IntegerCollectionTest {
    public static void main(String[] args) {

        IntegerCollection intColl = new IntegerCollection();

        intColl.add(1);
        intColl.add(2);
        intColl.add(3);
        intColl.add(4);

        System.out.println(intColl);

        intColl.remove(3);
        intColl.remove(2);

        intColl.add(5);

        System.out.println(intColl);
        System.out.println(intColl.min());
        System.out.println(intColl.max());
        System.out.println(intColl.average());
        System.out.println(intColl.get(1));
        System.out.println(intColl.contains(5));
    }
}
