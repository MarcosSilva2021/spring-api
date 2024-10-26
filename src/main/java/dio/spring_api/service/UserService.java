package dio.spring_api.service;

import dio.spring_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
