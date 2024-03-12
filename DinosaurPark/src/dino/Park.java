package dino;

import java.util.ArrayList;

public class Park {
    private ArrayList<DinosaurSpecies> dinosaurSpeciesList;
    private ArrayList<Department> departments;

    public Park() {
        this.dinosaurSpeciesList = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addDinosaurSpecies(DinosaurSpecies species) {
        dinosaurSpeciesList.add(species);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public ArrayList<DinosaurSpecies> getDinosaurSpeciesList() {
        return dinosaurSpeciesList;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
}
