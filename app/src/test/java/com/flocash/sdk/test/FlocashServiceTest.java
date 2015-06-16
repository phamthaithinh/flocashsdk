package com.flocash.sdk.test;

import android.util.Log;

import com.flocash.ecom.sdk.BuildConfig;
import com.flocash.sdk.models.Environment;
import com.flocash.sdk.models.MerchantInfo;
import com.flocash.sdk.models.OrderInfo;
import com.flocash.sdk.models.PayerInfo;
import com.flocash.sdk.models.PaymentMethodInfo;
import com.flocash.sdk.models.Request;
import com.flocash.sdk.models.Response;
import com.flocash.sdk.service.FlocashService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.math.BigDecimal;

/**
 * Created by ThaiThinh on 6/13/2015.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class FlocashServiceTest {
    @Test
    public void testCreateOrder() {
        FlocashService service = new FlocashService(Environment.SANDBOX);
        OrderInfo orderInfo = new OrderInfo();
        OrderInfo order = new OrderInfo();
        PayerInfo payer = new PayerInfo();
        order.setAmount(new BigDecimal("1000.0"));
        order.setCurrency("NGN");
        order.setItem_name("test android");
        order.setItem_price("10");
        order.setOrderId("test123");
        order.setQuantity("1");
        payer.setCountry("NG");
        payer.setFirstName("Thai Thinh");
        payer.setLastName("Pham");
        payer.setEmail("phamthaithinh@gmail.com");
        payer.setMobile("+0986518056");
        MerchantInfo merchant = new MerchantInfo();
        Request request = new Request();
        request.setOrder(order);
        request.setPayer(payer);
        request.setMerchant(merchant);
        merchant.setMerchantAccount("phamthaithinh@yahoo.com");
        try {
            Log.i("Begin test", "Begin test");
            Response response = service.createOrder(request);
            Log.i(response.getErrorCode(), response.getErrorMessage());
            if (response.isSuccess()) {
                request = new Request();
                request.setOrder(new OrderInfo());
                request.getOrder().setTraceNumber(response.getOrder().getTraceNumber());
                request.setPayOption(new PaymentMethodInfo());
                request.getPayOption().setId(response.getPaymentOptions().getCards().get(0).getId());
                response=service.updatePaymentOpion(request);
                if(response.isSuccess()){
                    System.out.print(response.getOrder().getStatus());
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
