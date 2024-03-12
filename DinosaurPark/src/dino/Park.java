package dino; // 패키지명을 선언

import java.util.ArrayList; // ArrayList 클래스를 사용하기 위한 import문

public class Park { // Park 클래스 선언

    // 인스턴스 변수 선언
    private ArrayList<DinosaurSpecies> dinosaurSpeciesList; // 공룡 종 목록을 저장하는 ArrayList 객체
    private ArrayList<Department> departments; // 부서 목록을 저장하는 ArrayList 객체

    // Park 클래스의 생성자
    public Park() { // 매개변수 없는 생성자
        this.dinosaurSpeciesList = new ArrayList<>(); // 공룡 종 목록을 담을 ArrayList 객체 생성
        this.departments = new ArrayList<>(); // 부서 목록을 담을 ArrayList 객체 생성
    }

    // 공룡 종을 추가하는 메소드
    public void addDinosaurSpecies(DinosaurSpecies species) { // DinosaurSpecies 객체를 매개변수로 받는 addDinosaurSpecies 메소드
        dinosaurSpeciesList.add(species); // 공룡 종을 ArrayList에 추가
    }

    // 부서를 추가하는 메소드
    public void addDepartment(Department department) { // Department 객체를 매개변수로 받는 addDepartment 메소드
        departments.add(department); // 부서를 ArrayList에 추가
    }

    // 공룡 종 목록을 반환하는 메소드
    public ArrayList<DinosaurSpecies> getDinosaurSpeciesList() { // 공룡 종 목록을 반환하는 getDinosaurSpeciesList 메소드
        return dinosaurSpeciesList; // 공룡 종 목록 반환
    }

    // 부서 목록을 반환하는 메소드
    public ArrayList<Department> getDepartments() { // 부서 목록을 반환하는 getDepartments 메소드
        return departments; // 부서 목록 반환
    }
}
