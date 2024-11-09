package dio.spring_api.service.impl;

import dio.spring_api.domain.model.User;
import dio.spring_api.domain.repository.UserRepository;
import dio.spring_api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    // injetando atributos
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User update(Long id, User userToUpdate) {
        // Verifica se o usuário existe
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado !"));
        // Atualizar os campos
        existingUser.setName(userToUpdate.getName());
        existingUser.setAccount(userToUpdate.getAccount());
        existingUser.setCard(userToUpdate.getCard());
        existingUser.setFeatures(userToUpdate.getFeatures());
        existingUser.setNews(userToUpdate.getNews());

        // Salvando o usuário
        return userRepository.save(existingUser);
    }

    @Override
    public void delete(Long id) {

    }
}
