package com.ruoyi.system.service.tech.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTechDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "技师id不能为空")
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 城市编码
     */
    private Integer cityCode;

    /**
     * 简介
     */
    private String description;

    /**
     * 语音简介
     */
    private String voice;

    /**
     * 从业年份 格式 YYYY-MM
     */
    private String workYear;
}
