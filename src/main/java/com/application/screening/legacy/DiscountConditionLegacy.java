package com.application.screening.legacy;

import com.application.screening.Screening;

public interface DiscountConditionLegacy {
    boolean isSatisfiedBy(Screening screening);
}
