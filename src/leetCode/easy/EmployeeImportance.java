package leetCode.easy;

import java.util.List;
import java.util.Optional;
//https://leetcode.com/problems/employee-importance/description/

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        /* leetcode 문제에서 optional 지원하지 않음.
        Optional<Employee> optional = employees.stream()
                .filter(em -> em.id == id).findFirst();
        if (!optional.isPresent()) return 0;

        Employee employee = optional.get();
        */
        Employee employee = null;
        for (Employee em :employees) {
            if (em.id == id) {
                employee = em;
                break;
            }
        }

        if (employee == null) return 0;

        int totalValue = employee.importance;
        if (employee.subordinates.isEmpty()) {
            return totalValue;
        } else {
            for (int subId :employee.subordinates) {
                totalValue += getImportance(employees, subId);
            }
        }

        return totalValue;
    }


}

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
