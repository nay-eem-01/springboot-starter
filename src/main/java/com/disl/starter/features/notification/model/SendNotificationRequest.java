package com.disl.starter.features.notification.model;

import com.disl.starter.features.notification.enums.NotificationType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SendNotificationRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String message;

    private NotificationType notificationType;

    private Set<Long> recipientIds = new HashSet<>();

}
