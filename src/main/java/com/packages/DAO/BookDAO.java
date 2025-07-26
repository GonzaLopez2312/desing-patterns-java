package com.packages.DAO;

import java.util.List;

public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooksByAuthor(String author);
    Book getBookByTitle(String title);
    int getBookPagesByTitle(String title);
}
