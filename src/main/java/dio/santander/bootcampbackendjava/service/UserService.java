package dio.santander.bootcampbackendjava.service;

import dio.santander.bootcampbackendjava.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
