package dino;
import java.util.ArrayList;

public class DinosaurSpecies {
    private String speciesName;
    private ArrayList<Dinosaur> dinosaurs;

    public DinosaurSpecies(String speciesName) {
        this.speciesName = speciesName;
        this.dinosaurs = new ArrayList<>();
    }

    public void addDinosaur(Dinosaur dinosaur) {
        dinosaurs.add(dinosaur);
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public ArrayList<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }
}
