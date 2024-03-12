package dino; // 패키지명을 선언

import java.util.ArrayList; // ArrayList 클래스를 사용하기 위한 import문

public class DinosaurSpecies { // DinosaurSpecies 클래스 선언

    // 인스턴스 변수 선언
    private String speciesName; // 공룡 종 이름을 저장하는 문자열 변수
    private ArrayList<Dinosaur> dinosaurs; // 공룡 목록을 저장하는 ArrayList 객체

    // DinosaurSpecies 클래스의 생성자
    public DinosaurSpecies(String speciesName) { // 공룡 종 이름을 매개변수로 받는 생성자
        this.speciesName = speciesName; // 공룡 종 이름 초기화
        this.dinosaurs = new ArrayList<>(); // 공룡 목록을 담을 ArrayList 객체 생성
    }

    // 공룡을 추가하는 메소드
    public void addDinosaur(Dinosaur dinosaur) { // Dinosaur 객체를 매개변수로 받는 addDinosaur 메소드
        dinosaurs.add(dinosaur); // 공룡을 ArrayList에 추가
    }

    // 공룡 종 이름을 반환하는 메소드
    public String getSpeciesName() { // 공룡 종 이름을 반환하는 getSpeciesName 메소드
        return speciesName; // 공룡 종 이름 반환
    }

    // 공룡 종 이름을 설정하는 메소드
    public void setSpeciesName(String speciesName) { // 새로운 공룡 종 이름을 매개변수로 받는 setSpeciesName 메소드
        this.speciesName = speciesName; // 공룡 종 이름 변경
    }

    // 공룡 목록을 반환하는 메소드
    public ArrayList<Dinosaur> getDinosaurs() { // 공룡 목록을 반환하는 getDinosaurs 메소드
        return dinosaurs; // 공룡 목록 반환
    }
}
