package Assignment12;

import Assignment12.library.Book;

public class LibraryApp {

    public static void main(String[] args) {

        Book book = new Book(
            101,
            "Java Programming",
            "Herbert Schildt",
            850
        );

        System.out.println("Book Details");
        book.displayBook();
    }
}