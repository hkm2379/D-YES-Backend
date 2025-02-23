package com.dyes.backend.domain.inquiry.service.response.read;

import com.dyes.backend.domain.inquiry.entity.InquiryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InquiryReadInquiryInfoResponse {
    private String title;
    private String content;
    private LocalDate createDate;
    private InquiryType inquiryType;
}
