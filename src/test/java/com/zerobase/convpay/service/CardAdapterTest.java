package com.zerobase.convpay.service;

import static org.junit.jupiter.api.Assertions.*;

import com.zerobase.convpay.type.CardUseCancelResult;
import com.zerobase.convpay.type.CardUseResult;
import org.junit.jupiter.api.Test;

class CardAdapterTest {
    private final CardAdapter cardAdapter = new CardAdapter();

    @Test
    void capture_success() {
        // Given
        Integer payAmount = 99;

        // When
        CardUseResult cardUseResult = cardAdapter.capture(payAmount);

        // Then
        assertEquals(CardUseResult.USE_SUCCESS, cardUseResult);
    }

    @Test
    void capture_fail() {
        // Given
        Integer payAmount = 101;

        // When
        CardUseResult cardUseResult = cardAdapter.capture(payAmount);

        // Then
        assertEquals(CardUseResult.USE_FAIL, cardUseResult);

    }

    @Test
    void cancelCapture_success() {
        // Given
        Integer cancelAmount = 1001;

        // When
        CardUseCancelResult cardUseCancelResult = cardAdapter.cancelCapture(cancelAmount);

        // Then
        assertEquals(CardUseCancelResult.USE_CANCEL_SUCCESS, cardUseCancelResult);

    }

    @Test
    void cancelCapture_fail() {
        // Given
        Integer cancelPayAmount = 999;

        // When
        CardUseCancelResult cardUseCancelResult = cardAdapter.cancelCapture(cancelPayAmount);

        // Then
        assertEquals(CardUseCancelResult.USE_CANCEL_FAIL, cardUseCancelResult);

    }
}