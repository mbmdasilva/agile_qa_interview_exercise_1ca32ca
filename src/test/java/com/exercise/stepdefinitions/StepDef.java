package com.exercise.stepdefinitions;

import com.exercise.VowelConsonantCount;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StepDef {

 private static List<String> enteredWords = new ArrayList<>();
 private static Map<String, Integer> vowelsConsonantCountForWord = new HashMap<>();

 @Given("the following strings")
 public void the_following_strings(DataTable wordsTable) throws Exception {
  enteredWords = wordsTable.transpose().asList(String.class);
 }


 @When("I input the strings as arguments to the program")
 public void i_input_the_strings_as_arguments_to_the_program(){
  vowelsConsonantCountForWord = VowelConsonantCount.getVowelsCountForStringList(enteredWords);

 }

 @When("I input the strings as arguments to the program for consonant count")
 public void iInputTheStringsAsArgumentsToTheProgramForConsonantCount(){
  vowelsConsonantCountForWord = VowelConsonantCount.getConsonantsCountForStringList(enteredWords);
 }
 @Then("I can see the vowels count for each string")
 public void i_can_see_the_vowels_count_for_each_string(Map<String, Integer> countVowels) {
   assertThat(vowelsConsonantCountForWord, is(equalTo(countVowels)));
 }


 @Then("I can see an {string} exception error thrown.")
 public void iCanSeeAnExceptionErrorThrown(String arg0) {
  vowelsConsonantCountForWord = VowelConsonantCount.getConsonantsCountForStringList(enteredWords);
 }

 @Then("I can see an empty array returned.")
 public void iCanSeeAnEmptyArrayReturned() {
 }

 @Then("I can see the consonant count for each string")
 public void iCanSeeTheConsonantCountForEachString(Map<String, Integer> countConsonants) {
  assertThat(vowelsConsonantCountForWord, is(equalTo(countConsonants)));

 }

 @Given("I input the strings as arguments to the program above the allowed allocation")
 public void iInputTheStringsAsArgumentsToTheProgramAboveTheAllowedAllocation(DataTable aboveLimitWordsTable) {
  enteredWords = aboveLimitWordsTable.transpose().asList(String.class);

 }
}


