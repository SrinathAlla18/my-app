package com.srinath.notification;

import com.srinath.clients.fraud.FraudClient;
import com.srinath.clients.notification.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;
    public void saveNotification(NotificationRequest notificationRequest) {
        Notification notification= Notification.builder()
                .toCustomerId(notificationRequest.toCustomerId())
                .toCustomerEmail(notificationRequest.toCustomerEmail())
                .message(notificationRequest.message())
                .sender("Srinath")
                .sentAt(LocalDateTime.now())
                .build();
        notificationRepository.save(notification);
    }
}
