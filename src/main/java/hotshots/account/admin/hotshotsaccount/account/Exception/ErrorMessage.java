package hotshots.account.admin.hotshotsaccount.account.Exception;

import java.util.Date;

public class ErrorMessage {

    private Date dateTimeStamp;

    private String errorMessage;

    private String details;

    public ErrorMessage(Date dateTimeStamp, String errorMessage, String details) {
        this.dateTimeStamp = dateTimeStamp;
        this.errorMessage = errorMessage;
        this.details = details;
    }


    public ErrorMessage() {
    }

    public Date getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(Date dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
