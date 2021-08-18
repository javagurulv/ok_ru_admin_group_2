package student_andrey_domas.lesson10;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        String title = book.getTitle();
        return titleToSearch != null && title != null && title.contains(titleToSearch);
    }

}