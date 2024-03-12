package dino;
import java.util.ArrayList;

public class DinosaurViewController {
    private DinosaurManager dinosaurManager;

    public DinosaurViewController(DinosaurManager dinosaurManager) {
        this.dinosaurManager = dinosaurManager;
    }

    public void displayDinosaursBySpecies(String species) {
        ArrayList<Dinosaur> dinosaurs = dinosaurManager.getDinosaursBySpecies(species);
        if (dinosaurs.isEmpty()) {
            System.out.println(species + " 종에 해당하는 공룡이 발견되지 않았습니다.");
        } else {
            System.out.println(species + " 종에 해당하는 공룡 목록:");
            for (Dinosaur dino : dinosaurs) {
                System.out.println("이름: " + dino.getName() + ", 나이: " + dino.getAge());
            }
        }
    }
}
