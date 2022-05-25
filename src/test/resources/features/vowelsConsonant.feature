Feature: Return the number of  vowels in a string

#  Scenario: Entering 4 string will returns a vowel count of each
#
#    Given the following strings
#      | matt | john | reynaldo | ade |
#    When I input the strings as arguments to the program
#    Then I can see the vowels count for each string
#      | matt     | 1 |
#      | john     | 1 |
#      | reynaldo | 3 |
#      | ade      | 2 |

  @test
  Scenario: Entering 4 string will returns a vowel count of each

    Given the following strings
      | matt | john | reynaldo | ade |
    When I input the strings as arguments to the program
    Then I can see the vowels and consonant count for each string
      | word     | vowel | consonant |
      | matt     | 1     | 3         |
      | john     | 1     | 3         |
      | reynaldo | 3     | 5         |
      | ade      | 2     | 1         |

