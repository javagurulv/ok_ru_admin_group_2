package student_alexander_fateev.lesson10;

class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Pushkin", "Buratina");
        Book book1 = new Book("Lermontov", "Hero");
        Book book2 = new Book("Lermontov", "SomeShit");
        Book book3 = new Book ("Tolstoy", "NewShit");
        BookDatabaseImpl bookDB = new BookDatabaseImpl();

        // add books
        bookDB.save(book);
        bookDB.save(book1);
        bookDB.save(book2);
        bookDB.save(book3);

        for (Object o: bookDB.getBookLibrary()) {
            Book getBook = (Book) o;
            System.out.println(getBook.getTitle() + " " + getBook.getAuthor());
        }

        //bookDB.delete(1L);
        //for (Object o: bookDB.getBookLibrary()) {
        //    Book getBook = (Book) o;
        //    System.out.println(getBook.getTitle() + " " + getBook.getAuthor());
        //}

        /*
        Long id = 3L;
        if (bookDB.findById(id).isPresent()) {
            Book foundBook = bookDB.findById(id).get();
            System.out.println(foundBook.getTitle() + " " + foundBook.getAuthor());
        }
        else {
            System.out.println("No book with ID: " + id);
        }
         */

        System.out.println("----");
        for (Object o: bookDB.findByAuthor("Lermontov!!!")) {
            Book getBook = (Book) o;
            System.out.println(getBook.getTitle() + " " + getBook.getAuthor());
        }
    }
}
