package dino; // 패키지명을 선언

public class Employee { // Employee 클래스 선언

    // 인스턴스 변수 선언
    private String name; // 직원 이름을 저장하는 문자열 변수
    private String department; // 직원 부서를 저장하는 문자열 변수

    // Employee 클래스의 생성자
    public Employee(String name, String department) { // 이름과 부서를 매개변수로 받는 생성자
        this.name = name; // 이름 초기화
        this.department = department; // 부서 초기화
    }

    // 직원 이름을 반환하는 메소드
    public String getName() { // 직원 이름을 반환하는 getName 메소드
        return name; // 직원 이름 반환
    }

    // 직원 이름을 설정하는 메소드
    public void setName(String name) { // 새로운 직원 이름을 매개변수로 받는 setName 메소드
        this.name = name; // 직원 이름 변경
    }

    // 직원 부서를 반환하는 메소드
    public String getDepartment() { // 직원 부서를 반환하는 getDepartment 메소드
        return department; // 직원 부서 반환
    }

    // 직원 부서를 설정하는 메소드
    public void setDepartment(String department) { // 새로운 직원 부서를 매개변수로 받는 setDepartment 메소드
        this.department = department; // 직원 부서 변경
    }
}
