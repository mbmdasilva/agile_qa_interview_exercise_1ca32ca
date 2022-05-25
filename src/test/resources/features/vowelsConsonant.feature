Feature: Return the number of  vowels in a string

  @test
  Scenario: Entering 4 string will returns a vowel count of each

    Given the following strings
      | matt | john | reynaldo | ade |
    When I input the strings as arguments to the program
    Then I can see the vowels count for each string
      | matt     | 1 |
      | john     | 1 |
      | reynaldo | 3 |
      | ade      | 2 |

  @test
  Scenario: Entering 4 string will returns a consonant count of each

    Given the following strings
      | matt | texted | reynaldo | ade |
    When I input the strings as arguments to the program for consonant count
    Then I can see the consonant count for each string
      | matt     | 3 |
      | texted   | 4 |
      | reynaldo | 5 |
      | ade      | 1 |

  @test
  Scenario: Entering strings above the allocated limit of 4 throws and error

    Given I input the strings as arguments to the program above the allowed allocation
      | matt | john | reynaldo | ade | testable |

    Then I can see an "Exceed the number of arguments allowed. You provided 5 words." exception error thrown.

  @test
  Scenario: Entering an empty strings returns an empty array

    Given the following strings
      |  |
    Then I can see an "java.lang.NullPointerException." exception error thrown.
