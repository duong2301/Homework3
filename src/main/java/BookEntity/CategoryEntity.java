package BookEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntityControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    private List<BookEntityControl> bookEntity;

    public CategoryEntityControl() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BookEntityControl> getBookEntityControlList() {
        return bookEntityControlList;
    }

    public void setBookEntityControlList(List<BookEntityControl> bookEntityControlList) {
        this.bookEntityControlList = bookEntityControlList;
    }
}
