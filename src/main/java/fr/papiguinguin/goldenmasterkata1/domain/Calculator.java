package fr.papiguinguin.goldenmasterkata1.domain;

import lombok.Builder;

@Builder
public class Calculator {

    public float divideNumberPositive(float nbr, float divisor)
    {
        float result;

        if(nbr < 0 || divisor < 0)
        {
            result = -1;
        }
        else if (divisor == 0)
        {
            result = 0;
        }
        else
        {
            result = nbr / divisor;
        }

        return result;
    }
}
