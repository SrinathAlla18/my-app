package com.srinath.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "Notification")
public interface NotificationClient {
    @PostMapping(path = "api/v1/notifications")
    void sendNotification( NotificationRequest request);



}
