package models;

public class Employer {


    String name;

    public Employer(String name) {
        this.name = name;
    }

    public Employer() {

    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                '}';
    }
}
