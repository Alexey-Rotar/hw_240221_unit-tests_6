import seminar_six.hw.ListComparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        ListComparator lc = new ListComparator();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5,6,7,8,9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(5,6,7,8,9));

        System.out.println("1 случай:");
        lc.compare(list1, list2);
        System.out.println("2 случай:");
        lc.compare(list2, list3);
        System.out.println("3 случай:");
        lc.compare(list1, list3);
    }
}

