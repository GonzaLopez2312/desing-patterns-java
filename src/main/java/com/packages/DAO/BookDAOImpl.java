package com.packages.DAO;

import java.util.List;

public class BookDAOImpl implements BookDAO {

    public List<Book> getBooks(){
        //Here there should be a query like Select * From Book b
        System.out.println("--- List with all the books in the database ---");
        return null;
    }
    public List<Book> getBooksByAuthor(String author) {
        //Here there should be a query like Select * From Book b Where b.author = :author
        System.out.println("--- List with all the books from author: " + author + " in the database ---");
        return null;
    }
    public Book getBookByTitle(String title){
        //Here there should be a query like Select * From Book b Where b.title = :title
        System.out.println("--- List with the book with title: " + title + " in the database ---");
        return null;
    }
    public int getBookPagesByTitle(String title){
        //Here there should be a query like Select b.pages From Book b Where b.title = :title
        System.out.println("--- Number of pages that has the book with title: " + title + " in the database ---");
        return 0;
    }
}
