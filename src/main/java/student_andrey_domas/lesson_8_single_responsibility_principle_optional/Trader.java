package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

public class Trader {

    private String fullName;
    private String country;
    private String city;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return "Trader: " + fullName + " from " + city + "(" + country + ")";
    }
}