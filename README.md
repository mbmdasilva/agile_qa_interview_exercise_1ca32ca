# Interview Exercise for Agile QA role

Please note while taking this test, do not mention 90 Percent of Everything or 90poe anywhere on the code or repository name.

Clone this repo in your private git space. Once done, please add github username: shilpa-sethi as a collaborator/ reviewer.
While submitting please ensure to add a README explaining how to run the test and all related info.

## Testing Task
Product Owner wants a feature as described below. The developer has added the code and share with you as a QA for review/ testing.

### Feature

As a user I want to be able to add a list of strings. 
I want to see the number of vowels in each of the strings that I have entered.

### Acceptance Criteria

1. I should see the number of vowels and consonant for each string in the order they are keyed in.
2. I should be able to add up to 4 strings at once.

### QA Task

1. Review the user story and prepare a list of questions/ assumptions.
- What Characters will be accepted as strings?
- Are we going to cater for apostrophes or hyphens in the Strings if they are names for examples?
- We can enter max 4 strings do we care the length of each string?
- I assume we are only going to use Latin characters
- Is there any json file with the way we want to manipulate/ display the results after entering the string ?

2. Review the code and provide feedback/ improvements. 
- It says that we should be able to add up to 4 strings currently as it is we only add 3
- Maybe we should add >4 instead of >=4 to allow 4 strings
- We need to extend the regex value to cater for Both upper and lower case characters
- The way we are handling the error using system out print could be using  logger instead.
- Entering pipes as string should throw an error currently it return an exception
- Change the main method from the class
- Change the name of the class to something more suitable such as VowelConsonantCount


3. Extend the program to return the number of consonants for each string array passed.
- There are for sure a better implementation then the one I came up with. 
- I think the first thing is to remove the dependency of main method as it difficults the tests.
- We could have a method that returns a map od list of map like this ` Map<String, List<Map<String, Integer>>> vowelConsonanCount = new HashMap<>();`
- This would allow us to have something similar to a payload {mateus:{[vowel=3,consonant=4]}}
4. Use BDD/ Cucumber to add test cases to test the program for both vowels and consonants.
5. Report any bugs you find. Include as much information as necessary and add the feedback as a file to the repo along with the Cucumber Test Report.
- To access the reports use this link :
- https://reports.cucumber.io/reports/097d6cf7-5347-4fcf-9fbc-20d7054001ce

Bonus points if you can add failing test cases for the bugs you find. 

## Evaluation Points

1. Use of Git.
2. Use of BDD/TDD/Cucumber.
3. Code Review skills.
4. Coding skills.
5. Test Case Coverage.

## Time limits

There are no hard time limits. We suggest not to spend more than ~2 hours.
