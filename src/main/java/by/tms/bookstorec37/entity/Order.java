package by.tms.bookstorec37.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "orders")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private OrderStatus orderStatus;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Book> bookList;
    private long quantity;
    @ManyToOne
    private User user;

    private String orderCreationDate;
    private String orderDeliveredDate;

}
