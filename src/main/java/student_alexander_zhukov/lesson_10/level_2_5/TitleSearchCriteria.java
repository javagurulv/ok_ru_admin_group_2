package student_alexander_zhukov.lesson_10.level_2_5;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equals(titleToSearch)) {
            return true;
        }
        return false;
    }
}
