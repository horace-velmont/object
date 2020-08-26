package com.application.screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
