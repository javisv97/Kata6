package Model;

public class Person {
    
    private int Id;
    private String name;
    private Character gender;
    private String birthDate;
    private Float weight;
    private String mail;

    public Person(int Id, String name, Character gender, String birthDate, Float weight, String mail) {
        this.Id = Id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.mail = mail;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Float getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }
    
    
}
