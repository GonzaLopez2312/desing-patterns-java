package com.packages.DAO;

import java.util.ArrayList;
import java.util.List;

public class BookServiceWithoutDAO {

    public void getAllBooks(){
        List<Book> books = new ArrayList<Book>();
        System.out.println("Here might be a call to open a conection to the database, then a query, then methods to" +
                "close the connection, among other things that are not related to business logic");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Number of Pages :" + book.getPages());
        }
    }

}
