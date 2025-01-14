package io.github.aylesw.mch.backend.service;

import io.github.aylesw.mch.backend.dto.NotificationDetails;
import io.github.aylesw.mch.backend.model.Injection;
import io.github.aylesw.mch.backend.model.SystemNotification;

import java.util.List;

public interface NotificationService {
    void createSystemNotification(NotificationDetails notificationDetails);

    void createEmailNotification(NotificationDetails notificationDetails);

    List<SystemNotification> getSystemNotifications(Long userId);

    void scheduleEmailsOnStart();

    void createNotificationsAboutInjection(Injection injection);

    void deleteNotificationsAboutInjection(Injection injection);

    void updateNotificationsAboutInjection(Injection injection);

    Long countNewNotificationsOfUser(Long userId);
}
