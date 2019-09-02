/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstasks;

/**
 *
 * Employee.java
 * @author James Mitchell 92020474
 * @date 2/09/19
 * @param <T>
 * 
 */
public class Employee<T> {
    T id;
    String name;
    String department;
    float salary;
    
    //TASK 2: constructor that set employee field values
    public Employee(T id, String name, String department, float salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    //TASK 2: method that prints out Employee details in a user-friendly manner
    public String toString(){
        return "Employee Information:\nEmployee ID: " + id + "\nName: " + name + "\nDepartament: " + department + "\nSalary: " + salary + "\n";
    }
}
