package org.example.postserviceaj.repository;

import org.example.postserviceaj.entity.MessageEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<MessageEntity, String> {

    Page<MessageEntity> findByMsgFromIgnoreCaseAndMsgToIgnoreCase(String fromUser,
                                                                  String toUser,
                                                                  Pageable pageable);

    @Query("{ $or: [ { 'msgFrom': ?0, 'msgTo': ?1 }, { 'msgFrom': ?1, 'msgTo': ?0 } ] }")
    Page<MessageEntity> findMessages(@Param("from") String fromUser, @Param("to") String toUser, Pageable pageable);

}

