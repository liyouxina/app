package com.ruoyi.system.service.tech.response;

public class TechInfoResponse {
    private String id;

    /**
     * 名字
     */
    private String name;

    /**
     * 身份证（脱敏）
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
