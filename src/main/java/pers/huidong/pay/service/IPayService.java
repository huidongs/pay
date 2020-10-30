package pers.huidong.pay.service;

import java.math.BigDecimal;

/**
 * @Desc:
 */
public interface IPayService {

    /**
     *   创建/发起支付
     *   @param orderId order id
     *   @param amount  order amount
     */
    void create(String orderId, BigDecimal amount);
}
