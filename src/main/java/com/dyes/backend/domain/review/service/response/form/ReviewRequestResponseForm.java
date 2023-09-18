package com.dyes.backend.domain.review.service.response.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequestResponseForm {
    private String title;
    private String content;
    private String userNickName;
    private LocalDate createDate;
    private LocalDate modifyDate;
}
