package com.homework.studyshop.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CustomerReservationDto {

    // 독서실 아이디
    private Long studyShopId;

    // 고객 아이디
    private Long customerId;

    // TODO 적절한 데이터 추가
}
