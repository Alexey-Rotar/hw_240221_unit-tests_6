package seminar_six.hw;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class ListComparatorTest {
    ListComparator lc = new ListComparator();;
    List<Integer> list1 = new ArrayList<>(Arrays.asList(5,6,7,8,9));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
    List<Integer> list3 = new ArrayList<>(Arrays.asList(5,6,7,8,9));
    List<Integer> list4;
    List<Integer> list5 = new ArrayList<>();
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    void firstListHasHigherAvg(){
        System.setOut(new PrintStream(output));
        lc.compare(list1, list2);

        assertThat(output.toString().trim()).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    void secondListHasHigherAvg(){
        System.setOut(new PrintStream(output));
        lc.compare(list2, list3);

        assertThat(output.toString().trim()).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void listsAveragesAreTheSame(){
        System.setOut(new PrintStream(output));
        lc.compare(list1, list3);

        assertThat(output.toString().trim()).isEqualTo("Средние значения равны");
    }

    @Test
    void oneListIsNullException(){
        assertThatThrownBy(()->{
            lc.compare(list1, list4);
        }).isInstanceOf(RuntimeException.class).hasMessage("List is null!");
    }

    @Test
    void oneListIsEmptyException(){
        assertThatThrownBy(()->{
            lc.compare(list1, list5);
        }).isInstanceOf(RuntimeException.class).hasMessage("List is empty!");
    }

}