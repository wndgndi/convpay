package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.type.PayMethodType;

public class PayCancelRequest {
    PayMethodType payMethodType;

    ConvenienceType convenienceType;

    Integer payCancelAmount;

    public PayCancelRequest(PayMethodType payMethodType, ConvenienceType convenienceType, Integer payCancelAmount) {
        this.payMethodType = payMethodType;
        this.convenienceType = convenienceType;
        this.payCancelAmount = payCancelAmount;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public PayCancelRequest setConvenienceType(
        ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
        return this;
    }

    public Integer getPayCancelAmount() {
        return payCancelAmount;
    }

    public PayCancelRequest setPayCancelAmount(Integer payCancelAmount) {
        this.payCancelAmount = payCancelAmount;
        return this;
    }

    public PayMethodType getPayMethodType() {
        return payMethodType;
    }

    public PayCancelRequest setPayMethodType(PayMethodType payMethodType) {
        this.payMethodType = payMethodType;
        return this;
    }
}
