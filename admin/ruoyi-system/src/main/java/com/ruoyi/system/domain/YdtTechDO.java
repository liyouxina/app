package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.YdtBaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 技师
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class YdtTechDO extends YdtBaseDO {
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

    /**
     * 手机号
     */
    private String phone;

    /**
     * 经度
     */
    private Long latitude;

    /**
     * 纬度
     */
    private Long longitude;

    // =================== from cache json
    /**
     * 近一年订单数量
     */
    private Integer orderCnt;

    // =================== from cfg json
    /**
     * 订单数量展示设置
     */
    private Integer orderCntSetting;

}
