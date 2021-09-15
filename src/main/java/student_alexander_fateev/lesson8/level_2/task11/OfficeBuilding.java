package student_alexander_fateev.lesson8.level_2.task11;

class OfficeBuilding extends Building{
    private String owner;
    private String tenant;

    public OfficeBuilding(int floors, String address, String owner, String tenant) {
        super(floors, address);
        this.owner = owner;
        this.tenant = tenant;
    }
}
