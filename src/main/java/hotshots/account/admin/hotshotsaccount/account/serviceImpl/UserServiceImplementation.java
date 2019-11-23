package hotshots.account.admin.hotshotsaccount.account.serviceImpl;

import hotshots.account.admin.hotshotsaccount.account.dto.models.UserDto;
import hotshots.account.admin.hotshotsaccount.account.entity.UserInfo;
import hotshots.account.admin.hotshotsaccount.account.repository.UserRepository;
import hotshots.account.admin.hotshotsaccount.account.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImplementation implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImplementation.class);

    @Autowired
    private UserRepository userRepository;

    // Injecting empty Entity object
    @Autowired
    private UserInfo userInfo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDto CreateUser(UserDto userdto) {
        logger.info("Inside user service implementation");

        BeanUtils.copyProperties(userdto, userInfo);

        // Encrypt Password
        userdto.setPassword(bCryptPasswordEncoder.encode(userdto.getPassword()));
        try {
            UserInfo userInfoResponse = userRepository.save(userInfo);
            logger.info("Saved User Details");
            BeanUtils.copyProperties(userInfoResponse, userdto);
            return userdto;
        } catch (DataIntegrityViolationException ex) {
            logger.info(ex.toString());
            throw ex;
        } catch (Exception ex) {
            logger.info(ex.toString());
            throw ex;
        }
    }
}
