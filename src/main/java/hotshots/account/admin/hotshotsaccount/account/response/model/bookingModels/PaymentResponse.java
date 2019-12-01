package hotshots.account.admin.hotshotsaccount.account.response.model.bookingModels;

import hotshots.account.admin.hotshotsaccount.account.Util.Utility;

public class PaymentResponse {

    private Utility.PaymentMethod paymentMode;

    private String receivedBy;

    private String receivedMobileNumber;

    public Utility.PaymentMethod getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(Utility.PaymentMethod paymentMode) {
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
