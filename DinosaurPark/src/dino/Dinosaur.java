package dino; // 패키지명을 선언

public class Dinosaur { // Dinosaur 클래스 선언

    // 인스턴스 변수 선언
    private String name; // 공룡 이름을 저장하는 문자열 변수
    private String species; // 공룡 종을 저장하는 문자열 변수
    private int age; // 공룡 나이를 저장하는 정수 변수
    private String diet; // 공룡 식성을 저장하는 문자열 변수
    private double size; // 공룡 크기를 저장하는 실수 변수

    // Dinosaur 클래스의 생성자
    public Dinosaur(String name, String species, int age, String diet, double size) { // 이름, 종, 나이, 식성, 크기를 매개변수로 받는 생성자
        this.name = name; // 이름 초기화
        this.species = species; // 종 초기화
        this.age = age; // 나이 초기화
        this.diet = diet; // 식성 초기화
        this.size = size; // 크기 초기화
    }

    // 공룡 이름을 반환하는 메소드
    public String getName() { // 공룡 이름을 반환하는 getName 메소드
        return name; // 공룡 이름 반환
    }

    // 공룡 이름을 설정하는 메소드
    public void setName(String name) { // 새로운 공룡 이름을 매개변수로 받는 setName 메소드
        this.name = name; // 공룡 이름 변경
    }

    // 공룡 종을 반환하는 메소드
    public String getSpecies() { // 공룡 종을 반환하는 getSpecies 메소드
        return species; // 공룡 종 반환
    }

    // 공룡 종을 설정하는 메소드
    public void setSpecies(String species) { // 새로운 공룡 종을 매개변수로 받는 setSpecies 메소드
        this.species = species; // 공룡 종 변경
    }

    // 공룡 나이를 반환하는 메소드
    public int getAge() { // 공룡 나이를 반환하는 getAge 메소드
        return age; // 공룡 나이 반환
    }

    // 공룡 나이를 설정하는 메소드
    public void setAge(int age) { // 새로운 공룡 나이를 매개변수로 받는 setAge 메소드
        this.age = age; // 공룡 나이 변경
    }

    // 공룡 식성을 반환하는 메소드
    public String getDiet() { // 공룡 식성을 반환하는 getDiet 메소드
        return diet; // 공룡 식성 반환
    }

    // 공룡 식성을 설정하는 메소드
    public void setDiet(String diet) { // 새로운 공룡 식성을 매개변수로 받는 setDiet 메소드
        this.diet = diet; // 공룡 식성 변경
    }

    // 공룡 크기를 반환하는 메소드
    public double getSize() { // 공룡 크기를 반환하는 getSize 메소드
        return size; // 공룡 크기 반환
    }

    // 공룡 크기를 설정하는 메소드
    public void setSize(double size) { // 새로운 공룡 크기를 매개변수로 받는 setSize 메소드
        this.size = size; // 공룡 크기 변경
    }
}
