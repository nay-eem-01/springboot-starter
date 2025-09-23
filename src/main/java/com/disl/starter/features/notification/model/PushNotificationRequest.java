package com.disl.starter.features.notification.model;

import com.disl.starter.features.notification.enums.NotificationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PushNotificationRequest {
    private String to;

    @JsonProperty("notification")
    private PushNotificationPayload pushNotificationPayload;

    @JsonProperty("data")
    private PushNotificationData pushNotificationData;



    @Getter
    @Setter
    public static class PushNotificationPayload {
        private String body;
        private String title;
        private final String priority = "high";

        @JsonProperty("content_available")
        private final boolean contentAvailable = true;

        public String getTitle() {
            return title != null ? title : "মদীনার পথে";
        }
    }

    @Getter
    @Setter
    public static class PushNotificationData {
        private String body;
        private String title;
        private NotificationType type;
        private long senderId = 0;
        private long recipientId = 0;
        private int unreadCount=0;
        private long typeId = 0;

        @JsonProperty("click_action")
        private final String clickAction = "FLUTTER_NOTIFICATION_CLICK";


        public String getTitle() {
            return title != null ? title : "মদীনার পথে";
        }

    }
}
