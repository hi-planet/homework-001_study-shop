package com.homework.studyshop.adapter;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationAdapter {

    private final Random random = new Random();

    public boolean sendReservationCancelNotification(Long customerId) {
        try {
            if (random.nextInt(10) == 0) {
                throw new Exception("Occur error");
            }
            log.info("Success to send ReservationCancelNotification. customerId: {}", customerId);
            return true;
        } catch (Exception e) {
            log.error("Failed to send ReservationCancelNotification. customerId: {}", customerId, e);
            return false;
        }
    }
}
