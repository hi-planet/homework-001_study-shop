package com.homework.studyshop.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StudyShopReservationDto {

    // 독서실 아이디
    private Long studyShopId;

    // 독서실 이름
    private String studyShopName;

    // TODO 적절한 데이터 추가
}
