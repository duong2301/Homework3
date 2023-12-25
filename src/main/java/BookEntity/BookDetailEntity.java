package BookEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BookDetail")
public class BookDetailEntityControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ishn")
    private String ishn;
    @Column(name = "price")
    private int price;
    @Column(name = "numberofpage")
    private int numberofpage;
    @Column(name = "date")
    private LocalDate date;
    @OneToOne(mappedBy = "BookDetail")
    private BookEntityControl bookEntity;

    public BookDetailEntityControl() {
        return;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIshn() {
        return ishn;
    }

    public void setIshn(String ishn) {
        this.ishn = ishn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberofpage() {
        return numberofpage;
    }

    public void setNumberofpage(int numberofpage) {
        this.numberofpage = numberofpage;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BookEntityControl getBookEntityControl() {
        return bookEntityControl;
    }

    public void setBookEntityControl(BookEntityControl bookEntityControl) {
        this.bookEntityControl = bookEntityControl;
    }
}
