package com.ruoyi.system.service.tech.request;

import lombok.Data;

@Data
public class QueryTechRequest {
    private Integer maxAge;

    private Integer minAge;

    private Long latitude;

    private Long longitude;
}
