package dino;
import java.util.ArrayList;

public class DinosaurManager {
    private ArrayList<Dinosaur> dinosaurs; 

    public DinosaurManager() {
        this.dinosaurs = new ArrayList<>(); 
    }

    public ArrayList<Dinosaur> getDinosaursBySpecies(String speciesName) {
        ArrayList<Dinosaur> filteredDinosaurs = new ArrayList<>();
        for (Dinosaur dinosaur : dinosaurs) {
            if (dinosaur.getSpecies().equals(speciesName)) {
                filteredDinosaurs.add(dinosaur);
            }
        }
        return filteredDinosaurs;
    }

}
