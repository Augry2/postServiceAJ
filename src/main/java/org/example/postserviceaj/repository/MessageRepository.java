package org.example.postserviceaj.repository;

import org.example.postserviceaj.entity.MessageEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface MessageRepository extends ListCrudRepository<MessageEntity, String>{
}
