package dev.zay.classandobject.examples;

import java.util.List;

public class FindBiggestNumberExample {

    /*
    FUNCTION findBiggestNumber(list)
    IF list is empty THEN
        RETURN null
    END IF

    SET max = list[0]

    FOR EACH number IN list
        IF number > max THEN
            SET max = number
        END IF
    END FOR

    RETURN max
END FUNCTION

     */

    static void main() {

        int [] numbers = {1};
        findBiggestNumber(numbers);

    }

    static void findBiggestNumber(int [] numbers){
        if (numbers.length <= 1) {
            System.out.println("No biggest number");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Biggest number: " + max);
    }
}
