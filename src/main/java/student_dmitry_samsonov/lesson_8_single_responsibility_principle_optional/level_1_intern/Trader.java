package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class Trader {

    private String fullName;
    private String city;
    private String country;

    private Trader() {}

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

    public static class Builder {
        private final String fullName;
        private String city;
        private String country;

        public Builder(String fullName){
            this.fullName = fullName;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Trader build(){
            Trader trader = new Trader();
            trader.fullName = this.fullName;
            trader.city = this.city;
            trader.country = this.country;
            return trader;
        }
    }
}
