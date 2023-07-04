package sm.project.everyoneexercise.backend.user.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sm.project.everyoneexercise.backend.user.application.port.in.ReadUserUseCase;
import sm.project.everyoneexercise.backend.user.application.port.out.ReadUserPort;
import sm.project.everyoneexercise.backend.user.domain.User;

@AllArgsConstructor
@Service
class UserReadService implements ReadUserUseCase {
    private final ReadUserPort readUserPort;

    @Override
    public User readUser(String userId) {
        return readUserPort.readUserByUserId(userId);
    }
}
