package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayResult;

public class PayResponse {

    PayResult payResult;

    Integer paidAmount;

    public PayResponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        this.paidAmount = paidAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public PayResponse setPayResult(PayResult payResult) {
        this.payResult = payResult;
        return this;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public PayResponse setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    @Override
    public String toString() {
        return "PayResponse{" +
            "payResult=" + payResult +
            ", paidAmount=" + paidAmount +
            '}';
    }
}
