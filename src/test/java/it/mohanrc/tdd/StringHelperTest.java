package it.mohanrc.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    private StringHelper stringHelper;

    @BeforeEach
    private void createInstance() {
        StringHelper stringHelper = new StringHelper();
        this.stringHelper = stringHelper;
    }

    @AfterEach
    private void cleanup() {
        this.stringHelper = null;
    }

    @Nested
    @DisplayName("Swapping last two characters from Input")
    class SwappingTest {
        @Test
        @DisplayName("Testing Swapping Input AB")
        void testSwapLast2CharacterCase1() {
            String expected = "BA";
            String actual = stringHelper.swapLast2Character("AB");
            assertEquals(expected, actual, ()-> "Reversing last 2 characters of string failed");
        }

        @Test
        @DisplayName("Testing Swapping Input RAIN")
        void testSwapLast2CharacterCase2() {
            String expected = "RANI";
            String actual = stringHelper.swapLast2Character("RAIN");
            assertEquals(expected, actual, ()-> "Reversing last 2 characters of string failed");
        }

        @Test
        @DisplayName("Testing Swapping Input A")
        void testSwapLast2CharacterCase3() {
            String expected = "A";
            String actual = stringHelper.swapLast2Character("A");
            assertEquals(expected, actual, ()-> "Reversing last 2 characters of string failed");
        }

        @Test
        @DisplayName("Testing Swapping Empty Input")
        void testSwapLast2CharacterCase4() {
            String expected = "";
            String actual = stringHelper.swapLast2Character("");
            assertEquals(expected, actual, ()-> "Reversing last 2 characters of string failed");
        }

        @Test
        @DisplayName("Testing Swapping Null Input")
        void testSwapLast2CharacterCase5() {
            String expected = null;
            String actual = stringHelper.swapLast2Character(null);
            assertEquals(expected, actual, ()-> "Reversing last 2 characters of string failed");
        }
    }

    @Nested
    @DisplayName("Removing specific character from first two position of Input")
    class RemovingTest {
        @Test
        @DisplayName("Testing Remove Specific Character From Input AB")
        void testRemoveSpecificCharacterInFirstTwoPositionCase1() {
            String expected = "B";
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition("AB", "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }

        @Test
        @DisplayName("Testing Remove Specific Character From Input RAIN")
        void testRemoveSpecificCharacterInFirstTwoPositionCase2() {
            String expected = "RIN";
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition("RAIN", "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }

        @Test
        @DisplayName("Testing Remove Specific Character From Input BBLA")
        void testRemoveSpecificCharacterInFirstTwoPositionCase3() {
            String expected = "BBLA";
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition("BBLA", "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }

        @Test
        @DisplayName("Testing Remove Specific Character From Input ABBCCAA")
        void testRemoveSpecificCharacterInFirstTwoPositionCase4() {
            String expected = "BBCCAA";
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition("ABBCCAA", "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }

        @Test
        @DisplayName("Testing Remove Specific Character From Input A")
        void testRemoveSpecificCharacterInFirstTwoPositionCase5() {
            String expected = "";
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition("A", "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }

        @Test
        @DisplayName("Testing Remove Specific Character From Empty Input")
        void testRemoveSpecificCharacterInFirstTwoPositionCase6() {
            String expected = "";
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition("", "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }

        @Test
        @DisplayName("Testing Remove Specific Character From Null Input")
        void testRemoveSpecificCharacterInFirstTwoPositionCase7() {
            String expected = null;
            String actual = stringHelper.removeSpecificCharacterInFirstTwoPosition(null, "A");
            assertEquals(expected, actual, ()-> "Removing specific character from first 2 position of string failed");
        }
    }
}