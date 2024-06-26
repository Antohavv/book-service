package telran.java52.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java52.book.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

	void deleteByAuthorsName(String name);
}
