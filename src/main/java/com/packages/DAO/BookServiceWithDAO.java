package com.packages.DAO;

import java.util.List;

public class BookServiceWithDAO {

    private BookDAOImpl bookDAO;

    public BookServiceWithDAO() {
        bookDAO = new BookDAOImpl();
    }

    public void getAllBooks(){
        List<Book> books = bookDAO.getBooks();
        System.out.println("This method calls the BookDAOImpl to get all books from database, and doesnt need to know " +
                "how to do it by himself");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Number of Pages :" + book.getPages());
        }
    }
}
