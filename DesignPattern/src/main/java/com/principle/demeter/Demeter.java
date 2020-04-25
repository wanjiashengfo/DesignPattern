package com.principle.demeter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
@Data
class Employee {
    private String id;
}
@Data
class CollegeEmployee{
    private String id;
}

class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院id"+i);
            list.add(collegeEmployee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager collegeManager){
        List<CollegeEmployee> allEmployee = getAllEmployee();
        System.out.println("-------------------分公司员工-----------------");
        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }
    }
}
class SchoolManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学校总部员工id"+i);
            list.add(collegeEmployee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager collegeManager){
        List<CollegeEmployee> allEmployee = collegeManager.getAllEmployee();

        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }

        List<CollegeEmployee> allEmployee1 = this.getAllEmployee();
        for (CollegeEmployee collegeEmployee : allEmployee1) {
            System.out.println(collegeEmployee.getId());
        }
    }
}


