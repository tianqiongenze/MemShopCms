package com.kofjs.memshop.cms.cloud.feign;

import com.kofjs.memshop.cms.cloud.feign.fallback.UploadFeignFallback;
import com.kofjs.memshop.cms.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 * <p>
 * Description:
 * </p>
 *
 * @author   Joel
 * @version v1.0.0
 * @date 2020-04-26 06:31:08
 * @see com.kofjs.memshop.cms.cloud.feign
 */
@FeignClient(value = "upload-on-cloud", path = "upload", configuration = FeignRequestConfiguration.class, fallback = UploadFeignFallback.class)
public interface UploadFeign {

    /**
     * 文件上传
     *
     * @param multipartFile {@code MultipartFile}
     * @return {@code String} 文件上传路径
     */
    @PostMapping(value = "")
    String upload(@RequestPart(value = "multipartFile") MultipartFile multipartFile);

}
