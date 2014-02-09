import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumbersInWord {

    NumbersInWord convertor = new NumbersInWord();

    @Test
    public void single_digit_convert_to_one_word() {
        assertEquals("zero", convertor.convert(0));
        assertEquals("one", convertor.convert(1));
        assertEquals("two", convertor.convert(2));
        assertEquals("three", convertor.convert(3));
        assertEquals("four", convertor.convert(4));
        assertEquals("five", convertor.convert(5));
        assertEquals("six", convertor.convert(6));
        assertEquals("seven", convertor.convert(7));
        assertEquals("eight", convertor.convert(8));
        assertEquals("nine", convertor.convert(9));
    }

    @Test
    public void two_digits_convert_to_one_word() {
        assertEquals("ten", convertor.convert(10));
        assertEquals("eleven", convertor.convert(11));
        assertEquals("twelve", convertor.convert(12));
        assertEquals("thirteen", convertor.convert(13));
        assertEquals("fourteen", convertor.convert(14));
        assertEquals("fifteen", convertor.convert(15));
        assertEquals("sixteen", convertor.convert(16));
        assertEquals("seventeen", convertor.convert(17));
        assertEquals("eighteen", convertor.convert(18));
        assertEquals("nineteen", convertor.convert(19));
        assertEquals("twenty", convertor.convert(20));
        assertEquals("thirty", convertor.convert(30));
        assertEquals("forty", convertor.convert(40));
        assertEquals("fifty", convertor.convert(50));
        assertEquals("sixty", convertor.convert(60));
        assertEquals("seventy", convertor.convert(70));
        assertEquals("eighty", convertor.convert(80));
        assertEquals("ninety", convertor.convert(90));
    }

    @Test
    public void two_digits_convert_to_two_words() {
        assertEquals("twenty one", convertor.convert(21));
        assertEquals("twenty two", convertor.convert(22));
        assertEquals("twenty nine", convertor.convert(29));
        assertEquals("thirty one", convertor.convert(31));
    }

    @Test
    public void three_and_four_digits_convert_to_one_number_string_with_two_words() {
        assertEquals("one hundred", convertor.convert(100));
        assertEquals("two hundred", convertor.convert(200));
        assertEquals("three hundred", convertor.convert(300));
        assertEquals("four hundred", convertor.convert(400));
        assertEquals("five hundred", convertor.convert(500));
        assertEquals("six hundred", convertor.convert(600));
        assertEquals("seven hundred", convertor.convert(700));
        assertEquals("eight hundred", convertor.convert(800));
        assertEquals("nine hundred", convertor.convert(900));
        assertEquals("one thousand", convertor.convert(1000));
        assertEquals("two thousand", convertor.convert(2000));
        assertEquals("three thousand", convertor.convert(3000));
        assertEquals("four thousand", convertor.convert(4000));
        assertEquals("five thousand", convertor.convert(5000));
        assertEquals("six thousand", convertor.convert(6000));
        assertEquals("seven thousand", convertor.convert(7000));
        assertEquals("eight thousand", convertor.convert(8000));
        assertEquals("nine thousand", convertor.convert(9000));
        assertEquals("ten thousand", convertor.convert(10000));
    }

    @Test
    public void three_digits_convert_to_one_number_string_with_two_words_and_another_word() {
        assertEquals("one hundred one", convertor.convert(101));
        assertEquals("one hundred eleven", convertor.convert(111));
    }

    @Test
    public void three_digits_convert_to_one_number_string_with_two_words_and_another_two_words() {
        assertEquals("one hundred twenty one", convertor.convert(121));
    }

    @Test
    public void acceptance_test() {
        assertEquals("one thousand two hundred thirty four", convertor.convert(1234));
    }
}
