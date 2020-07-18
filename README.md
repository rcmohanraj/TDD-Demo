# Test Driven Development with Junit5

**Steps to Follow:**  
**Red:**  
Write a new test case which fails

**Green:**  
Write simple possible solution to make it success

**Refactor:**
Write all the test cases and refactor the code to make all 
the possible test cases into green.

Implemented basic StringHelper class to demonstrate the TDD
approach.

All the tried solutions to improve the functionality are 
present in the StringHelper class in comment section.

1) Swap last two characters of a string

First we need to identify what is the input and output of a method swapLast2Character
with null method body. 

```
public String swapLast2Character(String input) {
    return null;
}
```

If the input is single character or null or empty then the method should return 
the same input. For rest of the input we need to swap the last two characters.

These are possible test cases we have for swapLast2Character method.  
Case1: Testing Swapping Input AB  
Case2: Testing Swapping Input RAIN  
Case3: Testing Swapping Input A  
Case4: Testing Swapping Empty Input  
Case5: Testing Swapping Null Input  

We have to write this test cases and if we run the cases the results will 
be in RED/Failed test cases.

Now refactor the swapLast2Character code to accommodate the cases one by one 
until we achieve all Green.

**Final code after refactoring:**
```
//Refactor 4
//Passing Test Case 1, 2, 3, 4, 5
if(input != null && input.length() > 1) {
    int length = input.length();
    String str = input.substring(0, length-2);
    char firstChar = input.charAt(length-2);
    char secondChar = input.charAt(length-1);
    return str+secondChar+firstChar;
}
return input;
```

It took me 4 refactors to achieve this fully working code. 
(Refer the swapLast2Character in StringHelper.java to view the code in 
every step of refactoring) 

2) Remove first two characters of a string if a specific character matches.

First we need to identify what is the input and output of a method 
removeSpecificCharacterInFirstTwoPosition with null method body. 

```
public String removeSpecificCharacterInFirstTwoPosition(String input, String characterToRemove) {
    return null;
}
```

These are possible test cases we have for removeSpecificCharacterInFirstTwoPosition method.  
Case1: Testing Remove Specific Character From Input AB  
Case2: Testing Remove Specific Character From Input RAIN  
Case3: Testing Remove Specific Character From Input BBLA  
Case4: Testing Remove Specific Character From Input ABBCCAA  
Case5: Testing Remove Specific Character From Input A  
Case6: Testing Remove Specific Character From Empty Input  
Case7: Testing Remove Specific Character From Null Input  

After writing test cases and going through the steps RED->GREEN->REFACTOR the final
code.  
**Final code after refactoring:**
```
//Refactor 4
//Passing Test Case 1, 2, 3, 4, 5, 6, 7
if(input == null) return input;
if(input.length() > 2) {
    String firstTwoChar = input.substring(0, 2);
    String lastTwoChar = input.substring(2);
    return firstTwoChar.replace(characterToRemove, "")+lastTwoChar;
} else {
    return input.replace(characterToRemove, "");
}
```

Again for this it took me 4 refactors to achieve this fully working code. 
(Refer the removeSpecificCharacterInFirstTwoPosition in StringHelper.java 
to view the code in every step of refactoring)

------------------------------------------------------------------------------------