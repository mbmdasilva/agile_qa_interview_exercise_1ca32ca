Feature: Return the number of  vowels in a string
  @test
  Scenario: Entering 4 string will returns a vowel count of each

    Given the following strings
      | "matt" | "john" | "reynaldo" | "ade" |
    When I input the strings as arguments to the program
    Then I can see the vowels count for each string
      | Count1 | Count2 | Count3 | Count4 |
      | "1"    | "1"    | "3"    | "2"    |


