package dino; // 패키지명을 선언

import java.util.ArrayList; // ArrayList 클래스를 사용하기 위한 import문

public class Department { // Department 클래스 선언

    // 인스턴스 변수 선언
    private String departmentName; // 부서 이름을 저장하는 문자열 변수
    private ArrayList<Employee> employees; // 직원 목록을 저장하는 ArrayList 객체

    // Department 클래스의 생성자
    public Department(String departmentName) { // 부서 이름을 매개변수로 받는 생성자
        this.departmentName = departmentName; // 부서 이름 초기화
        this.employees = new ArrayList<>(); // 직원 목록을 담을 ArrayList 객체 생성
    }

    // 직원을 추가하는 메소드
    public void addEmployee(Employee employee) { // Employee 객체를 매개변수로 받는 addEmployee 메소드
        employees.add(employee); // 직원을 ArrayList에 추가
    }

    // 부서 이름을 반환하는 메소드
    public String getDepartmentName() { // 부서 이름을 반환하는 getDepartmentName 메소드
        return departmentName; // 부서 이름 반환
    }

    // 부서 이름을 설정하는 메소드
    public void setDepartmentName(String departmentName) { // 새로운 부서 이름을 매개변수로 받는 setDepartmentName 메소드
        this.departmentName = departmentName; // 부서 이름 변경
    }

    // 직원 목록을 반환하는 메소드
    public ArrayList<Employee> getEmployees() { // 직원 목록을 반환하는 getEmployees 메소드
        return employees; // 직원 목록 반환
    }
}
