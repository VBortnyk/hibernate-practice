package com.dev.hbnt.service;

import com.dev.hbnt.dao.BookDao;
import com.dev.hbnt.lib.Inject;
import com.dev.hbnt.lib.Service;
import com.dev.hbnt.model.Author;
import com.dev.hbnt.model.Book;

@Service
public class BookServiceImpl implements BookService {
    @Inject
    private BookDao bookDao;

    @Override
    public Book create(Book book) {
        return bookDao.create(book);
    }

    @Override
    public Book getBookByTitle(String title) {
        return bookDao.getBookByTitle(title);
    }

    @Override
    public Book getBookByAuthor(Author author) {
        return bookDao.getBookByAuthor(author);
    }

    @Override
    public Book getBookByGenre() {
        return bookDao.getBookByGenre();
    }
}
