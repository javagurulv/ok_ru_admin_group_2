package student_alexander_zhukov.lesson_10.level_2_5;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equals(authorToSearch)) {
            return true;
        }
        return false;
    }

}
