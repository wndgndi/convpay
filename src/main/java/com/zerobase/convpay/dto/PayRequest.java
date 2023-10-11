package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.type.PayMethodType;

public class PayRequest {
    PayMethodType payMethodType;

    ConvenienceType convenienceType;

    Integer payAmount;

    public PayRequest(PayMethodType payMethodType, ConvenienceType convenienceType, Integer payAmount) {
        this.payMethodType = payMethodType;
        this.convenienceType = convenienceType;
        this.payAmount = payAmount;
    }

    public PayMethodType getPayMethodType() {
        return payMethodType;
    }

    public PayRequest setPayMethodType(PayMethodType payMethodType) {
        this.payMethodType = payMethodType;
        return this;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public PayRequest setConvenienceType(ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
        return this;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public PayRequest setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
        return this;
    }
}
