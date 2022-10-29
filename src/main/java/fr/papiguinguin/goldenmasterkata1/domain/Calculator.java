package fr.papiguinguin.goldenmasterkata1.domain;

import lombok.Builder;
import org.apache.commons.lang3.math.NumberUtils;

@Builder
public class Calculator {

    public float divideNumberPositive(float nbr, float divisor)
    {
        if (divisor ==  0) return 0;
        if(nbr < 0 || divisor < 0) return -1;
        return  nbr / divisor;
    }
}
