package com.application.screening.legacy;

import com.application.screening.Screening;

public class SequenceConditionLegacy implements DiscountConditionLegacy {
  private final int sequence;

  public SequenceConditionLegacy(int sequence) {
    this.sequence = sequence;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return false;
    //return screening.isSequence(sequence);
  }
}
