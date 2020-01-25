package hotshots.account.admin.hotshotsaccount.account.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "SlotDetails")
public class SlotDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private CustomerEntity customerInfo;

    @Column
    private PaymentMethod paymentMethod;

    @Column
    private List<ItemsUsed> itemsUsed;


    @ManyToOne()
    private CourtBookingDetailsEntity courtBookingDetailsEntity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerEntity getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerEntity customerInfo) {
        this.customerInfo = customerInfo;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<ItemsUsed> getItemsUsed() {
        return itemsUsed;
    }

    public void setItemsUsed(List<ItemsUsed> itemsUsed) {
        this.itemsUsed = itemsUsed;
    }
}
