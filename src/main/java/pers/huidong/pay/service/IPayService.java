package pers.huidong.pay.service;

import java.math.BigDecimal;

/**
 * @Desc:
 */
public interface IPayService {

/*
*   创建/发起支付
* */
    void create(String orderId, BigDecimal amount);
}
