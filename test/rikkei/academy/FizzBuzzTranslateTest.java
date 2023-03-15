package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    //Test translate
    @Test
    public void divisibleBy3() {
        int num = 6;
        String excepteđ = "Fizz";
        String result = FizzBuzzTranslate.translate(num);
        assertEquals(excepteđ, result);
    }
    @Test
    public void divisibleBy5() {
        int num = 10;
        String excepteđ = "Buzz";
        String result = FizzBuzzTranslate.translate(num);
        assertEquals(excepteđ, result);
    }
    @Test
    public void divisibleBy3And5() {
        int num = 15;
        String excepteđ = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(num);
        assertEquals(excepteđ, result);
    }
    @Test
    public void divisibleNot() {
        int num = 11;
        String excepted = "result";
        String result = FizzBuzzTranslate.translate(num);
        assertEquals(excepted, result);
    }
    //Test TranslateUp
//    @Test
//    public void divisibleBy3Up(){
//        int number = 3;
//        String excepted = "Fizz";
//        String result = FizzBuzzTranslate.translateUp(number);
//        assertEquals(excepted, result);
//    }
}