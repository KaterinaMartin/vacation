package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="/Users/steve/Desktop/vacation/src/test/resources/vacation.csv")
    public void testShouldCalculateVacation(int expected, int income, int expenses, int money) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, money);

        Assertions.assertEquals(expected, actual);
    }
}
