package it.mohanrc.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//assertj Assertions
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

//Junit5 Assertions
//import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest {

    private PhoneNumberValidator phoneNumberValidator;

    @BeforeEach
    void setUp() {
        this.phoneNumberValidator = new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({
            "+919041111111, true",
            "+9190411111111, false",
            "919041111111, false",
    })
    void itShouldValidatePhoneNumberCase1(String phoneNumber, boolean expected) {
        //Given
        //String phoneNumber = "+919041111111"; //commented out because input coming as param
        //When
        boolean isValid = phoneNumberValidator.test(phoneNumber);
        //Then
        //assertEquals(expected, isValid);//Junit 5
        assertThat(isValid).isEqualTo(expected); //AssertJ
    }
}
