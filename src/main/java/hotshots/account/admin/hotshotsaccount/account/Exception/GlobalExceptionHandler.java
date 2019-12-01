package hotshots.account.admin.hotshotsaccount.account.Exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private BeanFactory beanFactory;

    @ExceptionHandler(UserServiceException.class)
    public final ResponseEntity<ErrorMessage> handleUserServiceControllerException(Exception ex, WebRequest request){

        String errorMessageToSend = null;
        if(ex.getCause() == null){
            errorMessageToSend = ex.getMessage();
        }
        else{
            errorMessageToSend = ProcessErrorMessage(ex.getCause());
        }
        ErrorMessage errObj = beanFactory.getBean(ErrorMessage.class, new Date(), errorMessageToSend, request.getDescription(false));

        return new ResponseEntity<>(errObj, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private String ProcessErrorMessage(Throwable cause){
        Throwable causeDetails = cause.getCause();
        if(causeDetails instanceof ConstraintViolationException){
            var sqlException = ((ConstraintViolationException) causeDetails).getSQLException();
            if(sqlException != null){
                return sqlException.getMessage();
            }
        }

        return cause.getMessage();
    }

}
