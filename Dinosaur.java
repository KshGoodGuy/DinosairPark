package dino;

import java.util.ArrayList;

// Dinosaur 클래스 선언
public class Dinosaur {
    // 인스턴스 변수 선언
    private String name; // 공룡의 이름을 저장하는 문자열 변수
    private String species; // 공룡의 종을 저장하는 문자열 변수
    private int age; // 공룡의 나이를 저장하는 정수 변수
    private String diet; // 공룡의 식성을 저장하는 문자열 변수
    private double size; // 공룡의 크기를 저장하는 실수 변수
    private ArrayList<Dinosaur> dinosaurs; // 같은 종의 공룡을 저장하는 ArrayList 객체

    // Dinosaur 클래스의 생성자
    public Dinosaur(String name, String species, int age, String diet, double size) {
        this.name = name; // 공룡의 이름 초기화
        this.species = species; // 공룡의 종 초기화
        this.age = age; // 공룡의 나이 초기화
        this.diet = diet; // 공룡의 식성 초기화
        this.size = size; // 공룡의 크기 초기화
        this.dinosaurs = new ArrayList<>(); // 같은 종의 공룡을 담을 ArrayList 객체 생성
    }

    // 공룡의 이름을 반환하는 메소드
    public String getName() {
        return name; // 공룡의 이름 반환
    }

    // 공룡의 이름을 설정하는 메소드
    public void setName(String name) {
        this.name = name; // 공룡의 이름 변경
    }

    // 공룡의 종을 반환하는 메소드
    public String getSpecies() {
        return species; // 공룡의 종 반환
    }

    // 공룡의 종을 설정하는 메소드
    public void setSpecies(String species) {
        this.species = species; // 공룡의 종 변경
    }

    // 공룡의 나이를 반환하는 메소드
    public int getAge() {
        return age; // 공룡의 나이 반환
    }

    // 공룡의 나이를 설정하는 메소드
    public void setAge(int age) {
        this.age = age; // 공룡의 나이 변경
    }

    // 공룡의 식성을 반환하는 메소드
    public String getDiet() {
        return diet; // 공룡의 식성 반환
    }

    // 공룡의 식성을 설정하는 메소드
    public void setDiet(String diet) {
        this.diet = diet; // 공룡의 식성 변경
    }

    // 공룡의 크기를 반환하는 메소드
    public double getSize() {
        return size; // 공룡의 크기 반환
    }

    // 공룡의 크기를 설정하는 메소드
    public void setSize(double size) {
        this.size = size; // 공룡의 크기 변경
    }

    // 종에 따라 공룡을 필터링하여 반환하는 메소드
    public ArrayList<Dinosaur> getDinosaursBySpecies(String speciesName) {
        ArrayList<Dinosaur> filteredDinosaurs = new ArrayList<>();
        for (Dinosaur dinosaur : dinosaurs) {
            if (dinosaur.getSpecies().equals(speciesName)) {
                filteredDinosaurs.add(dinosaur);
            }
        }
        return filteredDinosaurs;
    }

    // 같은 종의 공룡을 추가하는 메소드
    public void addDinosaur(Dinosaur dinosaur) {
        dinosaurs.add(dinosaur);
    }

    // 공룡의 목록을 반환하는 메소드
    public ArrayList<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }
}
