package dino; // 패키지명을 선언

import java.util.ArrayList; // ArrayList 클래스를 사용하기 위한 import문

public class DinosaurManager { // DinosaurManager 클래스 선언

    // 인스턴스 변수 선언
    private ArrayList<Dinosaur> dinosaurs; // 공룡 목록을 저장하는 ArrayList 객체

    // DinosaurManager 클래스의 생성자
    public DinosaurManager() { // 매개변수 없는 생성자
        this.dinosaurs = new ArrayList<>(); // 공룡 목록을 담을 ArrayList 객체 생성
    }

    // 종에 따라 공룡을 필터링하여 반환하는 메소드
    public ArrayList<Dinosaur> getDinosaursBySpecies(String speciesName) { // 종 이름을 매개변수로 받는 getDinosaursBySpecies 메소드
        ArrayList<Dinosaur> filteredDinosaurs = new ArrayList<>(); // 종 이름에 해당하는 공룡을 저장할 ArrayList 객체 생성
        for (Dinosaur dinosaur : dinosaurs) { // 공룡 목록을 순회
            if (dinosaur.getSpecies().equals(speciesName)) { // 만약 공룡의 종이 매개변수로 받은 종 이름과 같다면
                filteredDinosaurs.add(dinosaur); // 해당 공룡을 필터링된 목록에 추가
            }
        }
        return filteredDinosaurs; // 필터링된 공룡 목록 반환
    }
}
