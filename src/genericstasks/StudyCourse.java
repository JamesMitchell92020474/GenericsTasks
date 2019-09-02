/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstasks;

/**
 *
 * StudyCourse.java
 * @author James Mitchell 92020474
 * @param <E>
 * @date 2/09/19
 * 
 */
public class StudyCourse<E> {
    
    private final String courseName;
    private final String courseCode;
    private final String courseDescription;
    
    //TASK 1: constructor that sets all the study course fields
    public StudyCourse(String courseName, String courseCode, String courseDescription){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;  
    }
    
    //TASK 1: method that prints our study course details in a user-firendly manner
    public String toString(){
        return "Course Information:\nCode: " + courseCode + "\nName: " + courseName + "\nDescription: " + courseDescription + "\n";
    }
}
