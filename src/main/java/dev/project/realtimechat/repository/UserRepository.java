package dev.project.realtimechat.repository;

import dev.project.realtimechat.user.Status;
import dev.project.realtimechat.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

    List<User> findAllByStatus(Status status);
}
