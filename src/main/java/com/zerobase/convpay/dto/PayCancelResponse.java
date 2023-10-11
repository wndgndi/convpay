package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayCancelResult;

public class PayCancelResponse {

    PayCancelResult PayCancelResult;
    Integer payCanceledAmount;

    public PayCancelResponse(PayCancelResult payCancelResult,
        Integer payCanceledAmount) {
        PayCancelResult = payCancelResult;
        this.payCanceledAmount = payCanceledAmount;
    }

    public PayCancelResult getPayCancelResult() {
        return PayCancelResult;
    }

    public PayCancelResponse setPayCancelResult(
        com.zerobase.convpay.type.PayCancelResult payCancelResult) {
        PayCancelResult = payCancelResult;
        return this;
    }

    public Integer getPayCanceledAmount() {
        return payCanceledAmount;
    }

    public PayCancelResponse setPayCanceledAmount(Integer payCanceledAmount) {
        this.payCanceledAmount = payCanceledAmount;
        return this;
    }

    @Override
    public String toString() {
        return "PayCancelResponse{" +
            "PayCancelResult=" + PayCancelResult +
            ", payCanceledAmount=" + payCanceledAmount +
            '}';
    }
}
