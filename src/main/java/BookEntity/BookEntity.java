package BookEntity;

import javax.persistence.*;

@Entity
@Table(name = "BookCategory")
public class BookEntityControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntityControl categoryEntityControl;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private BookDetailEntityControl bookDetailEntityControl;

    public BookEntityControl() {
        return;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CategoryEntityControl getCategoryEntityControl() {
        return categoryEntityControl;
    }

    public void setCategoryEntityControl(CategoryEntityControl categoryEntityControl) {
        this.categoryEntityControl = categoryEntityControl;
    }

    public BookDetailEntityControl getBookDetailEntityControl() {
        return bookDetailEntityControl;
    }

    public void setBookDetailEntityControl(BookDetailEntityControl bookDetailEntityControl) {
        this.bookDetailEntityControl = bookDetailEntityControl;
    }

    @Override
    public String toString() {
        return "BookEntityControl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categoryEntityControl=" + categoryEntityControl +
                ", bookDetailEntityControl=" + bookDetailEntityControl +
                '}';
    }
}
