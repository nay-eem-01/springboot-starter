package com.disl.starter.features.notification.entity;

import com.disl.starter.constants.AppTables;
import com.disl.starter.constants.AppTables.NotificationTable;
import com.disl.starter.entities.User;
import com.disl.starter.features.notification.enums.NotificationType;
import com.disl.starter.models.AuditModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = AppTables.NOTIFICATION_NAME)
@Getter
@Setter
public class Notification extends AuditModel<String> {

    @Column(name = NotificationTable.TITLE)
    private String title;

    @Column(name = NotificationTable.MESSAGE, columnDefinition = "TEXT")
    private String message;

    @Column(name = NotificationTable.TYPE_ID)
    private Long typeId = 0L;

    @Column(name = NotificationTable.IS_READ)
    private Boolean isRead = false;

    @Enumerated(EnumType.STRING)
    @Column(name = NotificationTable.TYPE)
    private NotificationType type;

    @JsonIgnoreProperties(ignoreUnknown = true, value = {
            "creationDateTimeStamp", "passwordResetToken",
            "lastModifiedDate", "createdBy", "creationDate",
            "roles", "lastModifiedDateTimeStamp", "lastModifiedBy",
    })
    @ManyToOne
    @JoinColumn(name = NotificationTable.SENDER_ID)
    private User sender;

    @JsonIgnoreProperties(ignoreUnknown = true, value = {
            "creationDateTimeStamp", "passwordResetToken",
            "lastModifiedDate", "createdBy", "creationDate",
            "roles", "lastModifiedDateTimeStamp", "lastModifiedBy",
    })
    @ManyToOne
    @JoinColumn(name = NotificationTable.RECIPIENT_ID)
    private User recipient;


}
