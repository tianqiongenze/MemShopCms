package com.kofjs.memshop.cms.provider.api;

import com.kofjs.memshop.cms.provider.domain.UmsAdminLoginLog;

/**
 * 系统登录日志服务
 * <p>
 * Description:
 * </p>
 *
 * @author   Joel
 * @version v1.0.0
 * @date 2020-04-19 03:48:49
 * @see com.kofjs.memshop.cms.provider.api
 */
public interface UmsAdminLoginLogService {

    /**
     * 新增日志
     *
     * @param umsAdminLoginLog {@link UmsAdminLoginLog}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int insert(UmsAdminLoginLog umsAdminLoginLog);

}
