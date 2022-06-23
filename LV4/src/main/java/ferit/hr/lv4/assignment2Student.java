/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv4;

import java.io.Serializable;

/*
    Implementirati klasu koja predstavlja studenta (maticni broj, ime, prezime, fakultet, smjer, godina,prosjecna_ocjena).
 */

public class assignment2Student implements Serializable {
    
    private String sn, firstName, lastName, college, course;
    private int year;
    private double avgGrade;

    public assignment2Student(String sn, String firstName, String lastName, String college, String course, int year, double avgGrade) {
        setSn(sn);
        setFirstName(firstName);
        setLastName(lastName);
        setCollege(college);
        setCourse(course);
        setYear(year);
        setAvgGrade(avgGrade);
    }
    
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }    
}
