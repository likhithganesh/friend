Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword

@Test
Scenario: Successful Login with Valid entries
Given user navigates to the website javatpoint.com 
When User Navigate to Login Page
And user logs in through Login Window by using <Username> as "username1"
And <Password> as "password1"
Then login must be successful.

@Before: Executes code before each test scenario
@After: Executes code after each test scenario
@BeforeStep: Executes code before each test step
@AfterStep: Executes code after each test step

@Test
Scenario Outline: Check if String is Palindrome 
  Given I entered word <wordToTest>
  When I test it for Palindrome
  Then the output should be <output>
  Examples:
    | wordToTest | output  |
    | "Refer"    | "true"  |
    | "Coin"     | "false" |
    | "Space"    | "false" |
    | "racecar"  | "true"  |