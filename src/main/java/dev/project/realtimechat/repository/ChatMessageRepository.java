package dev.project.realtimechat.repository;

import dev.project.realtimechat.chat.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage,String> {

    List<ChatMessage> findByChatId(String chatId);
}
