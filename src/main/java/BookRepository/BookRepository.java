package BookRepository;

import BookEntity.BookEntityControl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookCategory extends CrudRepository<BookEntityControl,Integer> {
    List<BookEntityControl> findByAuthor(String author);
    List<BookEntityControl> findByNameAndAuthor(String name,String author);
    List<BookEntityControl> findByNameOrAuthor(String name,String author);

    BookEntityControl findByBookDetailsIshn(String ishn);

    List<BookEntityControl> findByBookDetailsPriceLessThan(int price);
    List<BookEntityControl> findByBookDetailsPriceLessThanEqual(int price);
    List<BookEntityControl> findByBookDetailsPriceGreaterThanEqual(int price);

    List<BookEntityControl> findByNameContaining(String name);
}
