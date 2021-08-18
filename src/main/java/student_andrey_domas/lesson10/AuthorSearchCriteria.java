package student_andrey_domas.lesson10;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        String author = book.getAuthor();
        return authorToSearch != null && author != null && author.contains(authorToSearch);
    }

}