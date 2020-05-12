package com.kofjs.memshop.cms.business.feign.fallback;

import com.kofjs.memshop.cms.business.dto.params.IconParam;
import com.kofjs.memshop.cms.business.dto.params.PasswordParam;
import com.kofjs.memshop.cms.business.dto.params.ProfileParam;
import com.kofjs.memshop.cms.business.feign.ProfileFeign;
import com.kofjs.memshop.cms.commons.dto.ResponseResult;
import com.kofjs.memshop.cms.commons.utils.JsonMapperUtils;
import org.springframework.stereotype.Component;

/**
 * 个人信息服务熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author Joel
 * @version v1.0.0
 * @date 2020-04-27 23:50:08
 * @see com.kofjs.memshop.cms.business.feign.fallback
 */
@Component
public class ProfileFeignFallback implements ProfileFeign {

    public static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    @Override
    public String info(String username) {
        try {
            return JsonMapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String update(ProfileParam profileParam) {
        try {
            return JsonMapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String modifyPassword(PasswordParam passwordParam) {
        try {
            return JsonMapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String modifyIcon(IconParam iconParam) {
        try {
            return JsonMapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
