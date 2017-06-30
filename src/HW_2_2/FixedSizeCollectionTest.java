package HW_2_2;

/**
 * Created by denis on 08-Jun-17.
 */
public class FixedSizeCollectionTest {
    public static void main(String[] args) {
        FixedSizeCollection<Integer> fixSize = new FixedSizeCollection<>(16);

        fixSize.add(1);
        fixSize.add(2);
        fixSize.add(3);
        fixSize.add(4);
        fixSize.add(5);
        fixSize.add(6);
        fixSize.add(7);
        fixSize.add(8);
        fixSize.add(9);
        fixSize.add(10);
        fixSize.add(11);
        fixSize.add(12);
        fixSize.add(13);
        fixSize.add(14);
        fixSize.add(15);
        fixSize.add(16);
        fixSize.add(17);

            System.out.println(fixSize);

        FixedSizeCollection<Integer> fix = new FixedSizeCollection<>();

        fix.add(18);
        fix.add(17);
        fix.add(16);
        fix.add(15);
        fix.add(14);
        fix.add(13);
        fix.add(12);
        fix.add(11);
        fix.add(10);
        fix.add(9);
        fix.add(8);
        fix.add(7);
        fix.add(6);
        fix.add(5);
        fix.add(4);
        fix.add(3);
        fix.add(2);
        fix.add(1);

        System.out.println(fix);
    }
}
