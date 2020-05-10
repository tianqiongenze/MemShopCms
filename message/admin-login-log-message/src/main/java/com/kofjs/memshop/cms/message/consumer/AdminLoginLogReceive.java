package com.kofjs.memshop.cms.message.consumer;

import com.kofjs.memshop.cms.commons.utils.JsonMapperUtils;
import com.kofjs.memshop.cms.provider.api.UmsAdminLoginLogService;
import com.kofjs.memshop.cms.provider.domain.UmsAdminLoginLog;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginLogReceive {
    /**
     * 内网RPC调用管理员登录日志服务
     */
    @Reference(version ="services.versions.content.v1")
    private UmsAdminLoginLogService umsAdminLoginLogService;

    @StreamListener("admin-login-log-topic")
    public void receiveAdminLoginLog(String umsAdminLoginLogJson) throws Exception {
        UmsAdminLoginLog umsAdminLoginLog = JsonMapperUtils.json2pojo(umsAdminLoginLogJson, UmsAdminLoginLog.class);
        //接收到消息后调用管理员登录日志服务进行日志存储
        umsAdminLoginLogService.insert(umsAdminLoginLog);
    }

}
