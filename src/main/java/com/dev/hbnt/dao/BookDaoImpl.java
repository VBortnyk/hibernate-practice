package com.dev.hbnt.dao;

import com.dev.hbnt.exceptions.DataProcessingException;
import com.dev.hbnt.lib.Dao;
import com.dev.hbnt.model.Author;
import com.dev.hbnt.model.Book;
import com.dev.hbnt.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class BookDaoImpl implements BookDao{
    @Override
    public Book create(Book book) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            return book;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Failed to add book to the library", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Book getBookByTitle(String title) {
        String selectQuery = "FROM Book WHERE title = :title";
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery(selectQuery, Book.class);
            return (Book) query.getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Failed to get a book with title " + title, e);
        }
    }

    @Override
    public Book getBookByAuthor(Author author) {
        return null;
    }

    @Override
    public Book getBookByGenre() {
        return null;
    }
}
