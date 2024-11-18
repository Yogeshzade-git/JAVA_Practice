package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;

    //transient keyword is used to make field not serializable
    transient private Double salary;
    private String email;

    public Employee(int id, String name, Double salary, String email){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayDetails(){
        System.out.println(getId()+ "|" +getName()+"|"+getSalary()+"|"+getEmail());
        System.out.println("Class Name:- " + getClass());
    }
}
