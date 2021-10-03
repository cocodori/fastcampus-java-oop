package fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    @DisplayName("Java 소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // when
        List<Integer> actual = javaSort.sort(List.of(3, 4, 1, 2, 5));

        // then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}