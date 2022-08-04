package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Employee {

    private String eId;
    private String name;
    private String gender;
    private Date dateOfJoining;


    Employee() {

    }

    Employee(String eId,String name,String gender, Date dateOfJoining) {
        this.eId = eId;
        this.name = name;
        this.gender = gender;
        this.dateOfJoining = dateOfJoining;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("E101","Nayan","Male", new Date(12/12/2021));
        Employee employee2 = new Employee("E102","Gagan","Male",new Date(12/12/2020));
        Employee employee3 = new Employee("E103","Roshni","Female",new Date(12/12/2020));

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

       // HashMap<String,Employee> employeeHashMap = new
    }

}
