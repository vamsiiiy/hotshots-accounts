package hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SlotDetails {

 private CustomerDetails customerInfo;

 private  Payment paymentMethod;

 private List<ItemsUsed> itemsUsed;

    public CustomerDetails getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerDetails customerInfo) {
        this.customerInfo = customerInfo;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<ItemsUsed> getItemsUsed() {
        return itemsUsed;
    }

    public void setItemsUsed(List<ItemsUsed> itemsUsed) {
        this.itemsUsed = itemsUsed;
    }
}
