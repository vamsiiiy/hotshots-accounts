package hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels;

import hotshots.account.admin.hotshotsaccount.account.Util.Utility.PaymentMethod;

public class Payment {

    private PaymentMethod paymentMode;

    private String receivedBy;

    private String receivedMobileNumber;

    public PaymentMethod getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMethod paymentMode) {
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
