package com.kofjs.memshop.cms.cloud.feign;

import com.kofjs.memshop.cms.cloud.feign.fallback.MessageFeignFallback;
import com.kofjs.memshop.cms.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "message-center", path = "message", configuration = FeignRequestConfiguration.class, fallback = MessageFeignFallback.class)
public interface MessageFeign {

}
