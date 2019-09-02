/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstasks;

import java.util.ArrayList;

/**
 *
 * @author CPP_Curriculum
 */
public class GenericsTasks {

    //Adding ArrayLists
    public static ArrayList<StudyCourse> courses = new ArrayList<>();
    public static ArrayList<Employee> salesEmpList = new ArrayList<>();
    public static ArrayList<Employee> marketingEmpList = new ArrayList<>();
  
    
    public static void main(String[] args) {
        
        //TASK 1: creating StudyCourse objects
        StudyCourse course1 = new StudyCourse("Physics", "P101", "Physics Course");
        StudyCourse course2 = new StudyCourse("Geography", "G102", "Geography Course");
        StudyCourse course3 = new StudyCourse("Chemistry", "C302", "Chemistry course");
        
        //TASK 1: adding StudyCourse objects to the courses list
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        // courses.add("mathematics");
        //TASK 1: printing items of courses list
        courses.forEach((sc) -> {
            System.out.println(sc);
        });
       
        //Creating Employee objects from Sales and Marketing department
        Employee emp1 = new Employee(1, "John Smith", "Sales", 75000.0f);
        Employee emp2 = new Employee(2, "James Smith", "Sales", 80000.0f);
        Employee emp3 = new Employee(3, "Justin Smith", "Sales", 80000.0f);
        Employee emp4 = new Employee("ANNMAR", "Anna Smith", "Marketing", 100000.0f);
        Employee emp5 = new Employee("ALEMAR", "Alexander Smith", "Marketing", 110000.0f);
        Employee emp6 = new Employee("ANDMAR", "Andrew Smith", "Marketing", 120000.0f);
       
        //adding employee objects to the appropriate lists
        salesEmpList.add(emp1);
        salesEmpList.add(emp2);
        salesEmpList.add(emp3);
        marketingEmpList.add(emp4);
        marketingEmpList.add(emp5); 
        marketingEmpList.add(emp6); 
        
        //printing out both sales and marketing employee lists
        System.out.println("Sales Department Staff:");
        salesEmpList.forEach((e) -> {
            System.out.println(e);
        });
        System.out.println("Marketing Department Staff:");
        marketingEmpList.forEach((k) -> {
            System.out.println(k);
        });
    }        
}