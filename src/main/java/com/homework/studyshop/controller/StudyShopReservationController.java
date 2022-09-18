package com.homework.studyshop.controller;

import com.homework.studyshop.controller.dto.CustomerReservationDto;
import com.homework.studyshop.controller.dto.ReservationApprovalRequestDto;
import com.homework.studyshop.controller.dto.ReservationCancelRequestDto;
import com.homework.studyshop.controller.dto.ReservationRequestDto;
import com.homework.studyshop.controller.dto.StudyShopReservationDto;
import com.homework.studyshop.controller.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/study-shop")
@RestController
public class StudyShopReservationController {

    /**
     * 월단위 예약 현황 조회
     */
    @GetMapping("/find-by-shop")
    public Response<StudyShopReservationDto> findByMonth(@RequestParam Long studyShopId,
                                                         @RequestParam String month /* yyyy-mm */) {
        return Response.emptyOk();
    }

    /**
     * 고객 예약 현황 조회
     */
    @GetMapping("/find-by-customer")
    public Response<CustomerReservationDto> findByCustomer(@RequestParam Long customerId) {
        return Response.emptyOk();
    }

    /**
     * 예약
     */
    @PostMapping("/reserve-seat")
    public Response<Boolean> reserveSeat(@RequestBody ReservationRequestDto requestDto) {
        return Response.emptyOk();
    }

    /**
     * 예약 확정
     */
    @PostMapping("/approve-seat")
    public Response<Boolean> approveSeat(@RequestBody ReservationApprovalRequestDto requestDto) {
        return Response.emptyOk();
    }

    /**
     * 예약 취소
     */
    @PostMapping("/cancel-reserved-seat")
    public Response<Boolean> cancelReservedSeat(@RequestBody ReservationCancelRequestDto requestDto) {
        return Response.emptyOk();
    }
}
