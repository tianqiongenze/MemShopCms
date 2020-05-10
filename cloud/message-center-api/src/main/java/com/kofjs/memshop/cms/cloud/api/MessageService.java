package com.kofjs.memshop.cms.cloud.api;

import com.kofjs.memshop.cms.cloud.dto.UmsAdminLoginLogDTO;

public interface MessageService {

    boolean sendAdminLoginLog(UmsAdminLoginLogDTO umsAdminLoginLogDTO);

}
