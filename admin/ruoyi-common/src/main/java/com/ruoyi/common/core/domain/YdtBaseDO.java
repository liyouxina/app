package com.ruoyi.common.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class YdtBaseDO {
    private Long id;
    private Long ct;
    private Long ut;
    private String cb;
    private String ub;
    private String remark;
}
