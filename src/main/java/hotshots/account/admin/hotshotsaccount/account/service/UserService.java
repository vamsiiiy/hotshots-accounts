package hotshots.account.admin.hotshotsaccount.account.service;

import hotshots.account.admin.hotshotsaccount.account.dto.models.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDto CreateUser(UserDto userdto);
}
