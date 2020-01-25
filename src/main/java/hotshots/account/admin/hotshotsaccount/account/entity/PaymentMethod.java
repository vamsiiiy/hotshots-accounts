package hotshots.account.admin.hotshotsaccount.account.entity;

import javax.persistence.*;

@Table(name = "PaymentMethod")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String paymentMode;

    @Column
    private String receivedBy;

    @Column
    private String receivedMobileNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }


    public String getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
    }

    public String getReceivedMobileNumber() {
        return receivedMobileNumber;
    }

    public void setReceivedMobileNumber(String receivedMobileNumber) {
        this.receivedMobileNumber = receivedMobileNumber;
    }
}
