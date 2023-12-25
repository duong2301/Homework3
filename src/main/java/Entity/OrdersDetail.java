package Entity;

import javax.persistence.*;

@Entity
@Table(name = "ordersDetail")
public class OrdersDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "orderid")
    private int orderid;
    @Column(name = "productName")
    private String productName;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unitPrice")
    private double unitPrice;
    @ManyToOne
    @JoinColumn(name = "orderid")
    private OrdersEntity orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderid;
    }

    public void setOrderId(int orderid) {
        this.orderid = orderid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrdersEntity getOrders() {
        return orders;
    }

    public void setOrders(OrdersEntity orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrdersDetailEntity{" +
                "id=" + id +
                ", orderId=" + orderid +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", orders=" + orders +
                '}';
    }
}
