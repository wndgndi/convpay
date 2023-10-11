package com.zerobase.convpay.service;

import static org.junit.jupiter.api.Assertions.*;

import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.type.PayMethodType;
import org.junit.jupiter.api.Test;

class DiscountByConvenienceTest {
    DiscountByConvenience discountByConvenience = new DiscountByConvenience();

    @Test
    void discountTest() {
        // Given
        PayRequest payRequestG25 = new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 1000);
        PayRequest payRequestGU = new PayRequest(PayMethodType.MONEY, ConvenienceType.GU, 1000);
        PayRequest payRequestSEVEN = new PayRequest(PayMethodType.MONEY, ConvenienceType.SEVEN, 1000);

        // When
        Integer discountedAmountG25 = discountByConvenience.getDiscountedAmount(payRequestG25);
        Integer discountedAmountGU = discountByConvenience.getDiscountedAmount(payRequestGU);
        Integer discountedAmountSEVEN = discountByConvenience.getDiscountedAmount(payRequestSEVEN);

        // Then
        assertEquals(800, discountedAmountG25);
        assertEquals(900, discountedAmountGU);
        assertEquals(1000, discountedAmountSEVEN);

    }
}