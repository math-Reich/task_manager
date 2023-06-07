package Entities;

public class Gender {
    private char gender;

    public Gender(char gender) {
        this.gender = gender;
    }

    public String getGender() {
        if (this.gender == 'M') {
            return "Masculino";
        } else if (this.gender == 'F') {
            return "Feminino";
        }
        return "Indefinido";
    }

    @Override
    public String toString() {
        return getGender();
    }
}
