package pers.huidong.pay.service.impl;

import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pers.huidong.pay.service.IPayService;

import java.math.BigDecimal;

/**
 * @Desc:
 */
@Slf4j
@Service
public class PayServiceImpl implements IPayService {
    @Override
    public void create(String orderId, BigDecimal amount) {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("test");
        wxPayConfig.setMchId("test");
        wxPayConfig.setMchKey("test");
        wxPayConfig.setNotifyUrl("http://127.0.0.1");

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);

        //发起支付
        PayRequest payRequest = new PayRequest();
        payRequest.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);
        payRequest.setOrderId("123456789");
        payRequest.setOrderName("测试支付订单");
        payRequest.setOrderAmount(0.01);
        PayResponse response = bestPayService.pay(payRequest);
        log.info("response{}",response);
    }
}
