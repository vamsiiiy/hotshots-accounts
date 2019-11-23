package hotshots.account.admin.hotshotsaccount.account.response.model;

import org.springframework.stereotype.Component;

@Component
public class UserSignUpResponse {

    private String firstName;

    private String mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
