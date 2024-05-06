import static org.junit.Assert.assertEquals;


import java.util.Random;

import org.junit.Test;


public class TestMain {
    
    @Test
    public void Main_tests() {
        // Массив для тестирования
        int[] numbers = {5, 3, 9, 1, 7};
        
        int result_min = Main._min(numbers);
        int result_max = Main._max(numbers);
        int result_mult = Main._mult(numbers);
        int result_sum = Main._sum(numbers);
        
        assertEquals(1, result_min);
        assertEquals(9, result_max);

        assertEquals(5*3*9*1*7, result_mult);
        assertEquals(5+3+9+1+7, result_sum);
    }

    @Test
    public void speed_test() {
        int[] numbers = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        long start = System.currentTimeMillis();
        int test1 = Main._min(numbers);
        int test2 = Main._max(numbers);
        int test3 = Main._mult(numbers);
        int test4 = Main._sum(numbers);

        long end = System.currentTimeMillis();
        long time  = (end - start);
        boolean flag = true ? time <= 1 : false;
        assertEquals(true, flag);
    }

    @Test
    public void negative_numbers_test() {
        int[] numbers = {-5, -3, -9, -1, -7};

        int result_min = Main._min(numbers);
        int result_max = Main._max(numbers);
        int result_mult = Main._mult(numbers);
        int result_sum = Main._sum(numbers);
        
        assertEquals(-9, result_min);
        assertEquals(-1, result_max);

        assertEquals(-5*3*9*1*7, result_mult);
        assertEquals(-(5+3+9+1+7), result_sum);
    }
}
