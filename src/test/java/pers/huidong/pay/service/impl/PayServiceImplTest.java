package pers.huidong.pay.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pers.huidong.pay.PayApplicationTests;

import java.math.BigDecimal;

/**
 * @Desc:
 */
public class PayServiceImplTest extends PayApplicationTests {

    @Autowired
    private PayServiceImpl payServiceImpl;
    @Test
    public void create() {
        //BigDecimal.valueOf(0.01) 或者 new BigDecimal("0.01") 不可用 new BigDecimal(0.01)
        //原因：当double 和 float 时，实际保存的值并不是是准确的0.99,二进制无法表示，需要扩展精度
        payServiceImpl.create("123445567",BigDecimal.valueOf(0.01));
    }
}