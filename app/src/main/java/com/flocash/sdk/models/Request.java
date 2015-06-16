package com.flocash.sdk.models;

/**
 * Created by ThaiThinh on 6/13/2015.
 */
public class Request {
    private OrderInfo order;
    private PayerInfo payer;
    private MerchantInfo merchant;
    private PaymentMethodInfo payOption;

    public OrderInfo getOrder() {
        return order;
    }

    public void setOrder(OrderInfo order) {
        this.order = order;
    }

    public PayerInfo getPayer() {
        return payer;
    }

    public void setPayer(PayerInfo payer) {
        this.payer = payer;
    }

    public MerchantInfo getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantInfo merchant) {
        this.merchant = merchant;
    }

    public PaymentMethodInfo getPayOption() {
        return payOption;
    }

    public void setPayOption(PaymentMethodInfo payOption) {
        this.payOption = payOption;
    }
}
