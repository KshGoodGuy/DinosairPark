package dino;
import java.util.ArrayList;
// DinosaurViewController 클래스 선언
public class DinosaurViewController {
    // 인스턴스 변수 선언
    private Dinosaur dinosaurManager; // DinosaurManager 객체를 저장하는 변수

    // DinosaurViewController 클래스의 생성자
    public DinosaurViewController(Dinosaur dinosaurManager) { // DinosaurManager 객체를 매개변수로 받는 생성자
        this.dinosaurManager = dinosaurManager; // DinosaurManager 객체 초기화
    }

    // 종에 따라 공룡을 화면에 출력하는 메소드
    public void displayDinosaursBySpecies(String species) { // 종 이름을 매개변수로 받는 displayDinosaursBySpecies 메소드
        ArrayList<Dinosaur> dinosaurs = dinosaurManager.getDinosaursBySpecies(species); // 종에 해당하는 공룡 목록을 받아옴
        if (dinosaurs.isEmpty()) { // 만약 공룡 목록이 비어있다면
            System.out.println(species + " 종에 해당하는 공룡이 발견되지 않았습니다."); // 해당 종의 공룡이 발견되지 않았음을 출력
        } else { // 그렇지 않다면
            System.out.println(species + " 종에 해당하는 공룡 목록:"); // 해당 종의 공룡 목록 출력
            for (Dinosaur dino : dinosaurs) { // 공룡 목록을 순회하면서
                System.out.println("이름: " + dino.getName() + ", 나이: " + dino.getAge()); // 각 공룡의 이름과 나이를 출력
            }
        }
    }
}
