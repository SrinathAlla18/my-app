package com.srinath.notification;

import com.srinath.clients.notification.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notifications")
@Slf4j
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public void saveNotification(@RequestBody NotificationRequest notificationRequest){
        log.info("new Notification Sent {}",notificationRequest);
        notificationService.saveNotification(notificationRequest);
    }

}
