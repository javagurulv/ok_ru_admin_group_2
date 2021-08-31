package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_5;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country) {
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
}







