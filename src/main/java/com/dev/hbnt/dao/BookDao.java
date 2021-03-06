package com.dev.hbnt.dao;

import com.dev.hbnt.model.Author;
import com.dev.hbnt.model.Book;

public interface BookDao {

    public Book create(Book book);

    public Book getBookByTitle(String title);

    public Book getBookByAuthor(Author author);

    public Book getBookByGenre();
}
