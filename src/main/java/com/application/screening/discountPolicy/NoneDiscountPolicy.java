package com.application.screening.discountPolicy;

import com.application.screening.Money;
import com.application.screening.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
