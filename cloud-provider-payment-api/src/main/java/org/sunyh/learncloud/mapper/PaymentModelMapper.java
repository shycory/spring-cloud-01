package org.sunyh.learncloud.mapper;

import org.apache.ibatis.annotations.Param;

public interface PaymentModelMapper {
    int insert(@Param("serial") String serial);
}
