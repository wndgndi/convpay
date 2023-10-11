package com.zerobase.convpay.service;

import static org.junit.jupiter.api.Assertions.*;

import com.zerobase.convpay.dto.PayCancelResponse;
import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.dto.PayCancelRequest;
import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;
import com.zerobase.convpay.type.PayCancelResult;
import com.zerobase.convpay.type.PayMethodType;
import com.zerobase.convpay.type.PayResult;
import org.junit.jupiter.api.Test;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();

    @Test
    void pay_success() {
        // Given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 50);

        // When
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        // Then
        assertEquals(PayResult.SUCCESS, payResponse.getPayResult());
        assertEquals(35, payResponse.getPaidAmount());
    }

    @Test
    void pay_fail() {
        // Given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 1500_001);

        // When
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        // Then
        assertEquals(PayResult.FAIL, payResponse.getPayResult());
        assertEquals(0, payResponse.getPaidAmount());
    }

    @Test
    void pay_cancel_success() {
        // Given
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenienceType.G25, 101);

        // When
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);

        // Then
        assertEquals(PayCancelResult.PAY_CANCEL_SUCCESS, payCancelResponse.getPayCancelResult());
        assertEquals(101, payCancelResponse.getPayCanceledAmount());
    }

    @Test
    void pay_cancel_fail() {
        // Given
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenienceType.G25, 99);

        // When
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);

        // Then
        assertEquals(PayCancelResult.PAY_CANCEL_FAIL, payCancelResponse.getPayCancelResult());
        assertEquals(0, payCancelResponse.getPayCanceledAmount());
    }
}