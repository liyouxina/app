package com.ruoyi.system.service.tech.impl;

import com.ruoyi.system.service.tech.TechQueryService;
import com.ruoyi.system.service.tech.request.QueryTechRequest;
import com.ruoyi.system.service.tech.response.TechInfoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechQueryServiceImpl implements TechQueryService {
    @Override
    public List<TechInfoResponse> getTechList(QueryTechRequest request) {
        return List.of();
    }

    @Override
    public TechInfoResponse getTechInfo(Long id) {
        return null;
    }
}
