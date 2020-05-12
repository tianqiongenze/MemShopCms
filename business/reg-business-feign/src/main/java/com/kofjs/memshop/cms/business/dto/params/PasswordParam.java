package com.kofjs.memshop.cms.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改密码参数
 * <p>
 * Description:
 * </p>
 *
 * @author Joel
 * @version v1.0.0
 * @date 2020-04-23 04:38:15
 * @see com.kofjs.memshop.cms.business.dto
 */
@Data
public class PasswordParam implements Serializable {

    private String username;
    private String oldPassword;
    private String newPassword;

}
