package hotshots.account.admin.hotshotsaccount.account.controller;

import hotshots.account.admin.hotshotsaccount.account.Exception.UserServiceException;
import hotshots.account.admin.hotshotsaccount.account.dto.models.UserDto;
import hotshots.account.admin.hotshotsaccount.account.request.model.UserSignUpRequest;
import hotshots.account.admin.hotshotsaccount.account.response.model.UserSignUpResponse;
import hotshots.account.admin.hotshotsaccount.account.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserSignUpResponse userSignUpResponse;

    @Autowired
    private UserService userService;

    @Autowired
    private UserDto userDto;

    // Create New User
    @RequestMapping(method = RequestMethod.POST)
    public UserSignUpResponse CreateUser(@RequestBody UserSignUpRequest userSignRequest) {

        logger.info("Inside User Sign Up Controller");
        logger.info("Received request for {}", userSignRequest.getMobileNumber());

        if(userSignRequest.getMobileNumber().isEmpty()) throw new UserServiceException("Mobile Number is Missing");
        if(userSignRequest.getPassword().isEmpty()) throw new UserServiceException("Password is Missing");
        if(userSignRequest.getFirstName().isEmpty()) throw new UserServiceException("FirstName is Missing");

        BeanUtils.copyProperties(userSignRequest, userDto);
        logger.info("copied properties to UserDto");

        try{
            UserDto returnedUserDto = userService.CreateUser(userDto);
            BeanUtils.copyProperties(returnedUserDto, userSignUpResponse);

            return userSignUpResponse;
        }
        catch(Exception ex){
            throw new UserServiceException(ex);
        }
    }
}
