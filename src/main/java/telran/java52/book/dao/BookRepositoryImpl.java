package telran.java52.book.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import telran.java52.book.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	@PersistenceContext
	EntityManager em;

	@Override
	public void deleteByAuthorsName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(String isbn) {
		return em.find(Book.class, isbn) != null;
	}

	@Override
	public Book save(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Optional<Book> findById(String isbn) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteById(String isbn) {
		// TODO Auto-generated method stub

	}

}
