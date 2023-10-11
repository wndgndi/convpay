package com.zerobase.convpay.service;

import static com.zerobase.convpay.type.MoneyUseResult.USE_FAIL;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.zerobase.convpay.type.MoneyUseResult;
import com.zerobase.convpay.type.MoneyUseCancelResult;
import org.junit.jupiter.api.Test;

class MoneyAdapterTest {
    MoneyAdapter moneyAdapter = new MoneyAdapter();

    @Test
    void money_use_fail() {
        // Given
        Integer payAmount = 1000_0001;

        // When
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);

        // Then
        assertEquals(USE_FAIL, moneyUseResult);
    }

    @Test
    void money_use_success() {
        // Given
        Integer payAmount = 1000_000;

        // When
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);

        // Then
        assertEquals(MoneyUseResult.USE_SUCCESS, moneyUseResult);
    }

    @Test
    void money_use_cancel_success() {
        // Given
        Integer payCancelAmount = 101;

        // When
        MoneyUseCancelResult moneyUseCancelResult = moneyAdapter.payCancel(payCancelAmount);

        // Then
        assertEquals(MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS, moneyUseCancelResult);
    }

    @Test
    void money_use_cancel_fail() {
        // Given
        Integer payCancelAmount = 99;

        // When
        MoneyUseCancelResult moneyUseCancelResult = moneyAdapter.payCancel(payCancelAmount);

        // Then
        assertEquals(MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL, moneyUseCancelResult);
    }
}