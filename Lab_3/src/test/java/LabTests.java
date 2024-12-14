import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabTests {

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "0, '0'",
            "10, 'A'",
            "11, 'B'",
            "12, 'C'",
            "13, 'D'",
            "14, 'E'",
            "15, 'F'",
            "16, '10'",
            "31, '1F'",
            "255, 'FF'"
    })
    void TestConvert(int in, String expected){
        Task1 task1 = new Task1();
        assertEquals (task1.convertTo16(in), (expected));
    }

    @ParameterizedTest
    @CsvSource({
            "9, ''",
            "101, ''",
            "10, '10:A 30:1E 50:32 70:46 90:5A'",
            "11, '11:B 31:1F 51:33 71:47 91:5B'",
            "20, '20:14 40:28 60:3C 80:50'",
            "90, '90:5A'"
    })
    void testTask1(int in, String expected){
        Task1 task1 = new Task1();
        assertEquals(expected, task1.task1(in));
    }
    @ParameterizedTest
    @CsvSource({
            "HelloWorld, 3, KhoorZruog",
            "abc, 1, bcd",
            "fdf, 3, igi",
            "NoChange, 0, NoChange",
            "Circle, 256, Circle",
            "Duck, 255, Ctbj"
    })
    void testEncrypt(String input, int key, String expected) {
        String result = Task5.encrypt(input, key);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "KhoorZruog, 3, HelloWorld",
            "bcd, 1, abc",
            "igi, 3, fdf",
            "NoChange, 0, NoChange",
            "Circle, 256, Circle",
            "Ctbj, 255, Duck"
    })
    void testDecrypt(String input, int key, String expected) {
        String result = Task5.decrypt(input, key);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "+0234, true",
            "456456, true",
            "-02fe, false",
            "+sdasf, false",
            "-232154, true",
            "23, true",
            "sd, false"
    })
    void testCheckTemplate(String str, boolean isTrue){
        assertEquals(isTrue, Task16.isInteger(str));
    }

    @ParameterizedTest
    @CsvSource({
            "test, true",
            "something, true",
            "as02fe, false",
            "+number, false",
            "хеллоWorld, true",
            "нічого, true",
            "нуль Null, false",
            "Українська, true"
    })
    void testValidPattern(String str, boolean isTrue){
        assertEquals(isTrue, Task40.isValidPattern(str));
    }

    @ParameterizedTest
    @CsvSource({
            "test, TEST",
            "something, SOMETHING",
            "as02fe, ",
            "+number, ",
            "хеллоWorld, ХЕЛЛОWORLD",
            "нічого, НІЧОГО",
            "нуль Null, ",
            "Українська, УКРАЇНСЬКА"
    })
    void testChangeTemplate(String in, String expected){
        assertEquals(expected, Task40.changeTemplate(in));
    }
}
