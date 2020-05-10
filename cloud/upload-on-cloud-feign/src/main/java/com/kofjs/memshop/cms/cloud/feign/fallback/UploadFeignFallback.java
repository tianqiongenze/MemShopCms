package com.kofjs.memshop.cms.cloud.feign.fallback;

import com.kofjs.memshop.cms.cloud.feign.UploadFeign;
import com.kofjs.memshop.cms.commons.dto.ResponseResult;
import com.kofjs.memshop.cms.commons.utils.JsonMapperUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author   Joel
 * @version v1.0.0
 * @date 2020-04-28 02:31:47
 * @see com.kofjs.memshop.cms.cloud.feign.fallback
 */
@Component
public class UploadFeignFallback implements UploadFeign {

    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    @Override
    public String upload(MultipartFile multipartFile) {
        try {
            return JsonMapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
