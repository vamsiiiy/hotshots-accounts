package hotshots.account.admin.hotshotsaccount.account.repository;

import hotshots.account.admin.hotshotsaccount.account.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Long> {
    UserInfo findByMobileNumber(String mobileNumber);
}


