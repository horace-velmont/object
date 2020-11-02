package com.application.screening.discountPolicy;

import com.application.screening.Money;
import com.application.screening.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
