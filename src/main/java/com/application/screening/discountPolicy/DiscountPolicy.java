package com.application.screening.discountPolicy;

import com.application.screening.DiscountCondition;
import com.application.screening.Money;
import com.application.screening.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
