package com.application.screening.discountPolicy;

import com.application.screening.Money;
import com.application.screening.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
