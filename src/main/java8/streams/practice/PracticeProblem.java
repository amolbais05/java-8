package main.java8.streams.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeProblem {

    public static void main(String[] args) {

    }

    public Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        Map<String, List<Employee>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
            employeeSubList.add(employee);
            resultMap.put(employee.getTitle(), employeeSubList);
        }
        return resultMap;
    }

    public Map<String, List<Employee>> groupByJobTitle_UsingStream(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle));
    }


    public double calculateAverage(List<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            sum += employee.getSalary();
            count++;
        }
        return (double) sum / count;
    }

    public double calculateAverageStream(List<Employee> employeeList) {
        return employeeList.stream().mapToInt(emp -> emp.getSalary())
                .average()
                .getAsDouble();
    }
}
