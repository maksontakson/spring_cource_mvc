package com.makskotlyar.mvc;

import com.makskotlyar.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "NOOOO")
    private String name;
    @NotEmpty(message = "surname is required")
    private String surName;
    @Min(value = 500, message = "must be graeter than 499")
    @Max(value = 1000, message = "must be les than 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;

    private String car;

    private Map<String, String> cars;

    private Map<String, String> languagesList;

    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "your pattern should be XXX-XX-XX")

    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "must ends with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resource");
        departments.put("Sales", "Sales");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Audi", "Audi");
        cars.put("Mercedes", "Mercedes");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Ukrainian", "UA");
        languagesList.put("Germanian", "GER");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
