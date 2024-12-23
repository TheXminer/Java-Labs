import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class lab5_Task1_Tests {
    @Test
    void testGetY() {
    // Arrange
    Task1 task = new Task1(1, -3, 2); // y = x^2 - 3x + 2

    // Act
    float result1 = task.getY(1); // y(1) = 1^2 - 3*1 + 2 = 0
    float result2 = task.getY(2); // y(2) = 2^2 - 3*2 + 2 = 0
    float result3 = task.getY(0); // y(0) = 0^2 - 3*0 + 2 = 2

    // Assert
    assertEquals(0, result1, 0.001);
    assertEquals(0, result2, 0.001);
    assertEquals(2, result3, 0.001);
}
    @Test
    void testGetX() {
        // Arrange
        Task1 task = new Task1(1, -3, 2); // y = x^2 - 3x + 2

        // Act
        ArrayList<Float> roots = task.getX(0); // x^2 - 3x + 2 = 0

        // Assert
        assertEquals(2, roots.size()); // Має бути два корені
        assertEquals(2.0, roots.get(0), 0.001); // Перший корінь
        assertEquals(1.0, roots.get(1), 0.001); // Другий корінь
    }
    @Test
    void testGetXNoRealRoots() {
        // Arrange
        Task1 task = new Task1(1, 2, 5); // y = x^2 + 2x + 5

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            task.getX(0); // Очікуємо виключення через відсутність дійсних коренів
        });
    }
    @Test
    void testGetXOneRoot() {
        // Arrange
        Task1 task = new Task1(1, -2, 1); // y = x^2 - 2x + 1 (повний квадрат)

        // Act
        ArrayList<Float> roots = task.getX(0); // x^2 - 2x + 1 = 0

        // Assert
        assertEquals(2, roots.size());
        assertEquals(1.0, roots.get(0), 0.001); // Обидва корені однакові
        assertEquals(1.0, roots.get(1), 0.001);
    }
}
class lab5_Task5_Test {

    private Task5 task;

    @BeforeEach
    void setUp() {
        task = new Task5("Author", "Topic", "Initial text");
    }

    @Test
    void testConstructorInitialization() {
        assertEquals("Author", task.getAuthor());
        assertEquals("Topic", task.getTopic());
        assertEquals("Initial text", task.getText());
        assertNotNull(task.getCreationTime());
        assertNull(task.getEditTime());
    }

    @Test
    void testSetAuthor() {
        task.setAuthor("New Author");
        assertEquals("New Author", task.getAuthor());
    }

    @Test
    void testSetTopic() {
        task.setTopic("New Topic");
        assertEquals("New Topic", task.getTopic());
    }

    @Test
    void testSetTextUpdatesTextAndEditTime() {
        LocalDateTime beforeEdit = LocalDateTime.now();
        task.setText("Updated text");
        LocalDateTime afterEdit = LocalDateTime.now();

        assertEquals("Updated text", task.getText());
        assertNotNull(task.getEditTime());
        assertTrue(task.getEditTime().isAfter(beforeEdit) || task.getEditTime().isEqual(beforeEdit));
        assertTrue(task.getEditTime().isBefore(afterEdit) || task.getEditTime().isEqual(afterEdit));
    }

    @Test
    void testEditMessageUpdatesTextAndEditTime() {
        LocalDateTime beforeEdit = LocalDateTime.now();
        task.editMessage("Edited text");
        LocalDateTime afterEdit = LocalDateTime.now();

        assertEquals("Edited text", task.getText());
        assertNotNull(task.getEditTime());
        assertTrue(task.getEditTime().isAfter(beforeEdit) || task.getEditTime().isEqual(beforeEdit));
        assertTrue(task.getEditTime().isBefore(afterEdit) || task.getEditTime().isEqual(afterEdit));
    }

    @Test
    void testCreationTimeIsNotModified() {
        LocalDateTime creationTime = task.getCreationTime();
        task.setText("New text");
        assertEquals(creationTime, task.getCreationTime());
    }
}
class lab5_Task16_Tests{
    private Task16 employee;

    @BeforeEach
    void setUp() {
        employee = new Task16(
                "Іван", "Петров", "Сергійович",
                LocalDate.of(1985, 5, 20),
                "Чоловік", "Вища освіта", "123456789",
                "Київський університет", LocalDate.of(2015, 1, 10),
                "м. Київ, вул. Шевченка, 12"
        );
    }

    @Test
    void testEmployeeCreation() {
        assertEquals("Іван", employee.getFirstName());
        assertEquals("Петров", employee.getLastName());
        assertEquals("Сергійович", employee.getMiddleName());
        assertEquals(LocalDate.of(1985, 5, 20), employee.getDateOfBirth());
        assertEquals("Чоловік", employee.getGender());
        assertEquals("Вища освіта", employee.getEducation());
        assertEquals("123456789", employee.getEducationDocumentNumber());
        assertEquals("Київський університет", employee.getEducationalInstitution());
        assertEquals(LocalDate.of(2015, 1, 10), employee.getStartDate());
        assertEquals("м. Київ, вул. Шевченка, 12", employee.getHomeAddress());
    }

    @Test
    void testSetters() {
        employee.setFirstName("Олексій");
        employee.setLastName("Сидоров");
        employee.setMiddleName("Іванович");
        employee.setDateOfBirth(LocalDate.of(1990, 2, 15));
        employee.setGender("Чоловік");
        employee.setEducation("Середня спеціальна освіта");
        employee.setEducationDocumentNumber("987654321");
        employee.setEducationalInstitution("Харківський коледж");
        employee.setStartDate(LocalDate.of(2020, 6, 1));
        employee.setHomeAddress("м. Харків, вул. Сумська, 25");

        assertEquals("Олексій", employee.getFirstName());
        assertEquals("Сидоров", employee.getLastName());
        assertEquals("Іванович", employee.getMiddleName());
        assertEquals(LocalDate.of(1990, 2, 15), employee.getDateOfBirth());
        assertEquals("Чоловік", employee.getGender());
        assertEquals("Середня спеціальна освіта", employee.getEducation());
        assertEquals("987654321", employee.getEducationDocumentNumber());
        assertEquals("Харківський коледж", employee.getEducationalInstitution());
        assertEquals(LocalDate.of(2020, 6, 1), employee.getStartDate());
        assertEquals("м. Харків, вул. Сумська, 25", employee.getHomeAddress());
    }

    @Test
    void testInvalidSetters() {
        // Ensure that null or invalid updates can be caught as needed
        employee.setFirstName(null);
        employee.setLastName("");
        assertNull(employee.getFirstName());
        assertEquals("", employee.getLastName());
    }
}
class lab5_Task40_Tests {

    @Test
    void testAddition() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);
        Fraction result = fraction1.add(fraction2);
        assertEquals("5/6", result.toString());
    }

    @Test
    void testSubtraction() {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 4);
        Fraction result = fraction1.subtract(fraction2);
        assertEquals("1/2", result.toString());
    }

    @Test
    void testMultiplication() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.multiply(fraction2);
        assertEquals("1/2", result.toString());
    }

    @Test
    void testDivision() {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(2, 7);
        Fraction result = fraction1.divide(fraction2);
        assertEquals("21/10", result.toString());
    }

    @Test
    void testToDouble() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals(0.75, fraction.toDouble(), 0.0001);
    }

    @Test
    void testSimplification() {
        Fraction fraction = new Fraction(4, 8);
        assertEquals("1/2", fraction.toString());
    }

    @Test
    void testInvalidDenominator() {
        assertThrows(ArithmeticException.class, () -> new Fraction(1, 0));
    }

    @Test
    void testNegativeFractions() {
        Fraction fraction = new Fraction(-2, 4);
        assertEquals("-1/2", fraction.toString());

        Fraction fraction2 = new Fraction(2, -4);
        assertEquals("-1/2", fraction2.toString());

        Fraction fraction3 = new Fraction(-2, -4);
        assertEquals("1/2", fraction3.toString());
    }

    @Test
    void testMixedNumberNormalization() {
        MixedNumber mixedNumber = new MixedNumber(1, 5, 4);
        assertEquals("2 1/4", mixedNumber.toString());

        MixedNumber mixedNumber2 = new MixedNumber(0, 9, 4);
        assertEquals("2 1/4", mixedNumber2.toString());
    }

    @Test
    void testMixedNumberToString() {
        MixedNumber mixedNumber = new MixedNumber(2, 0, 3);
        assertEquals("2", mixedNumber.toString());

        MixedNumber mixedNumber2 = new MixedNumber(0, 1, 2);
        assertEquals("1/2", mixedNumber2.toString());
    }
}