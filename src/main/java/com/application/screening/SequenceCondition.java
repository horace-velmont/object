package com.application.screening;

public class SequenceCondition implements DiscountCondition {
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
