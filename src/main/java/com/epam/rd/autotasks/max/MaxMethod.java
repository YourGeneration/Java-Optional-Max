package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;
        if(values != null && values.length !=0){
            int max = values[0];
            for(int i = 0;i < values.length; i++){
                if(values[i]> max) max = values[i];
            }
            result = OptionalInt.of(max);
        }
        else{
            result = OptionalInt.empty();
        }
        return result;
    }
}
