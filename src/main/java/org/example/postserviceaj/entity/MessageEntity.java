package org.example.postserviceaj.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "messages")
public class MessageEntity {

    public MessageEntity() {}

    String msgFrom;
    String msgTo;
    String msgContent;
    String msgDateAndTime;

    @Id
    String id;

    public MessageEntity(String msgFrom, String msgTo, String msgContent, String id, String msgDateAndTime) {
        this.msgFrom = msgFrom;
        this.msgTo = msgTo;
        this.msgContent = msgContent;
        this.id = id;
        this.msgDateAndTime = msgDateAndTime;
    }

    @Override
    public String toString() {
        return "messageEntity{" +
                "msgFrom='" + msgFrom + '\'' +
                ", msgTo='" + msgTo + '\'' +
                ", msgContent='" + msgContent + '\'' +
                ", msgDateAndTime='" + msgDateAndTime + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
