package com.kofjs.memshop.cms.cloud.producer;

import com.kofjs.memshop.cms.cloud.api.MessageService;
import com.kofjs.memshop.cms.cloud.dto.UmsAdminLoginLogDTO;
import com.kofjs.memshop.cms.cloud.message.MessageSource;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 消息生产者    既是Rest风格Http协议的消息服务提供者，又是RPC风格Dubbo协议的消息服务提供者
 * <p>
 * Description:
 * </p>
 *
 * @author   Joel
 * @version v1.0.0
 * @date 2020-04-20 17:33:21
 * @see com.kofjs.memshop.cms.cloud.producer
 */
@Component
@Service(version = "${services.versions.content.v1}")
public class MessageProducer implements MessageService {

    @Resource
    private MessageSource source;

    /**
     * 管理登录日志
     *
     * @param dto {@link UmsAdminLoginLogDTO}
     * @return {@code boolean}
     */
    @Override
    public boolean sendAdminLoginLog(UmsAdminLoginLogDTO dto) {
        return source.adminLoginLog().send(MessageBuilder.withPayload(dto).build());
    }
}
