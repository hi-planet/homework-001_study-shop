package com.homework.studyshop.service;

import com.homework.studyshop.adapter.NotificationAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class NotificationService {

    private final NotificationAdapter notificationAdapter;

    /**
     * 고객에게 예약 취소 메시지를 보낸다.
     * 10% 확률로 실패가 발생 할 수 있으며 실패시 false 가 반환된다.
     */
    public boolean sendReservationCancelNotification(Long customerId) {
        return notificationAdapter.sendReservationCancelNotification(customerId);
    }
}
