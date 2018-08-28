### How to install 
    - git clone and import it as a maven project
    - The main method and tests can be tested by selecting the configuration and clicking the play button on intellij

### Dependencies:
    - java version "1.8.0_131"

### Code
    - Wrote a method that parses through String sentence, removes punctutation, and stores each word in an array 
        - The longest word of the array is found and stored into a list along with the character count of the word
            - I used the list datastructure here because in the scenario where there are multiple words with the
            same char count, you will have multiple answers. I needed a way to store that data temmporarily 
            before I can convert it to a string 
   
    - The second method just converts the list from the previous method and presents it as a string
   
### Tests
    - Test for the longestWord method
    - Test for the listToString method 
    - Tests the combo of the two in the main method
    - Didn't factor in the case where the input string is empty or all numbers or all symbols in the main file or the
    test, our class assumes we will always get sentences with regular words and it will account for duplicate words
   
            

