package com.kofjs.memshop.cms.provider.service;

import com.kofjs.memshop.cms.provider.domain.UmsAdminLoginLog;
import com.kofjs.memshop.cms.provider.api.UmsAdminLoginLogService;
import com.kofjs.memshop.cms.provider.mapper.UmsAdminLoginLogMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService {

    @Resource
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;

    @Override
    public int insert(UmsAdminLoginLog umsAdminLoginLog) {
        return umsAdminLoginLogMapper.insert(umsAdminLoginLog);
    }
}
