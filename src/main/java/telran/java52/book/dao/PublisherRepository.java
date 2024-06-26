package telran.java52.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import telran.java52.book.model.Publisher;

public interface PublisherRepository {
	
//	@Query("select distinct p.publisherName from Book b join b.publisher p join b.authors a where a.name=?1")
	List<String> findPublishersByAuthor(String authorName);
	
	Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);

	Optional<Publisher> findById(String publisherName);

	Publisher save(Publisher publisher);
}
