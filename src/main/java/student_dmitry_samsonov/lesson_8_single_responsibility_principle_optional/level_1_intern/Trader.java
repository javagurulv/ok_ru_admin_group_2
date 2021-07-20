package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class Trader {

    private String fullName;
    private String city;
    private String country;


    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Name: " + this.getFullName() + ", City: " + this.getCity() + ", Country: " + this.getCountry();
    }
}
