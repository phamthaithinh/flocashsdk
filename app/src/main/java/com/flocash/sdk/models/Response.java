package com.flocash.sdk.models;

import java.io.Serializable;

/**
 * Created by ThaiThinh on 6/13/2015.
 */
public class Response extends Request  implements Serializable {
    private boolean success;
    private String errorCode;
    private String errorMessage;
    private PaymentOptionInfo paymentOptions;

    public PaymentOptionInfo getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(PaymentOptionInfo paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
