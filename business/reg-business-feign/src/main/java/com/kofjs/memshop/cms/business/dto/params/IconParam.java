package com.kofjs.memshop.cms.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改头像参数
 * <p>
 * Description:
 * </p>
 *
 * @author Joel
 * @version v1.0.0
 * @date 2020-04-26 23:44:42
 * @see com.kofjs.memshop.cms.business.dto
 */
@Data
public class IconParam implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String path;

}
