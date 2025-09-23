package com.disl.starter.features.notification.model;

import com.disl.starter.features.notification.enums.NotificationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateNotification {

    private long typeId;
    private long senderId;
    private String message;
    private long recipientId;
    private NotificationType notificationType;


}
