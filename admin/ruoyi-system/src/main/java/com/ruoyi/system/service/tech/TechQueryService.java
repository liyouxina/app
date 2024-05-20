package com.ruoyi.system.service.tech;

import com.ruoyi.system.service.tech.request.QueryTechRequest;
import com.ruoyi.system.service.tech.response.TechInfoResponse;

import java.util.List;

public interface TechQueryService {
    /**
     * 客户端 获取技师列表
     * @param request
     * @return
     */
    List<TechInfoResponse> getTechList(QueryTechRequest request);

    /**
     * 客户端 获取技师详情
     * @param id
     * @return
     */
    TechInfoResponse getTechInfo(Long id);
}
