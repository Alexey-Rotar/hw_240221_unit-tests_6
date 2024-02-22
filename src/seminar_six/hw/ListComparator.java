package seminar_six.hw;

import java.util.List;
public class ListComparator {
    public void compare(List<Integer> list1, List<Integer> list2) {
        try {
            double a = avg(list1);
            double b = avg(list2);
            if (a > b)
                System.out.println("Первый список имеет большее среднее значение");
            else if (a < b)
                System.out.println("Второй список имеет большее среднее значение");
            else
                System.out.println("Средние значения равны");
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private double avg(List<Integer> list) throws IllegalArgumentException {
        if (list == null)
            throw new IllegalArgumentException("List is null!");
        if (list.isEmpty())
            throw new IllegalArgumentException("List is empty!");
        double sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        return sum/list.size();
    }
}