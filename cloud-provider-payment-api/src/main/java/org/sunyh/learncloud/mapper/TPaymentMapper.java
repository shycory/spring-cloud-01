package org.sunyh.learncloud.mapper;

import org.apache.ibatis.annotations.Param;
import org.sunyh.learncloud.modle.TPayment;
import org.sunyh.learncloud.modle.TPaymentExample;

import java.util.List;

public interface TPaymentMapper {
    long countByExample(TPaymentExample example);

    int deleteByExample(TPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPayment record);

    int insertSelective(TPayment record);

    List<TPayment> selectByExample(TPaymentExample example);

    TPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPayment record, @Param("example") TPaymentExample example);

    int updateByExample(@Param("record") TPayment record, @Param("example") TPaymentExample example);

    int updateByPrimaryKeySelective(TPayment record);

    int updateByPrimaryKey(TPayment record);
}