package com.application.screening;

import com.application.screening.discountPolicy.DiscountPolicy;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    @Getter
    private Money fee;
    @Setter
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {
        if (discountPolicy == null) {
            return fee;
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
