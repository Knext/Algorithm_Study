package leetCode.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EmployeeImportanceTest {

    @Test
    public void test_getImportance() {
        EmployeeImportance employeeImportance = new EmployeeImportance();

        assertThat(employeeImportance.getImportance(getTestList(), 1), is(11));
    }

    private List<Employee> getTestList() {
        //    [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
        List<Employee> list = new ArrayList<>();

        Employee em1 = new Employee();
        em1.id = 1;
        em1.importance = 5;
        em1.subordinates = Arrays.asList(2,3);
        list.add(em1);

        Employee em2 = new Employee();
        em2.id = 2;
        em2.importance = 3;
        em2.subordinates = Arrays.asList();
        list.add(em2);

        Employee em3 = new Employee();
        em3.id = 3;
        em3.importance = 3;
        em3.subordinates = Arrays.asList();
        list.add(em3);

        return list;
    }

}