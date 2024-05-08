package org.example.postserviceaj.controller;

import org.example.postserviceaj.entity.MessageEntity;
import org.example.postserviceaj.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MessageRestController {

    @Autowired
    MessageRepository messageRepository;

    // GET ALL testing purpose
    @GetMapping("/messages")
    public List<MessageEntity> getAllMsg(){
        return messageRepository.findAll();
    }

    // GET ONE
    @GetMapping("/messages/{id}")
    public MessageEntity getOneMsg(String id){
        return messageRepository.findById(id).get();
    }

    // POST MSG
    @PostMapping("/messages")
    public MessageEntity postMsg(@RequestBody MessageEntity messageEntity, @RequestHeader String userId){
        messageEntity.setMsgDateAndTime(LocalDateTime.now().toString());
        messageEntity.setMsgFrom(userId);
        return messageRepository.save(messageEntity);
    }

    // DELETE MSG
    @DeleteMapping("/messages/{id}")
    public void deleteMsg(@PathVariable String id){
        messageRepository.deleteById(id);
    }

}
