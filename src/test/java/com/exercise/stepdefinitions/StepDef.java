package com.exercise.stepdefinitions;

import com.exercise.LetterType;
import com.exercise.VowelConsonantCount;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertTrue;

public class StepDef {

 private static List<String> enteredWords = new ArrayList<>();
 private static Map<String, Integer> vowelsCountForWord = new HashMap<>();
 private static List<Map<String, Integer>> countVowelsAndConsonants = new ArrayList<>();
 private static Map<String, List<Map<String, Integer>>> vowelsConsonantCountForWord = new HashMap();

 @Given("the following strings")
 public void the_following_strings(DataTable vowelsTable)  {

  enteredWords = vowelsTable.transpose().asList(String.class);
 }

 @When("I input the strings as arguments to the program")
 public void i_input_the_strings_as_arguments_to_the_program(){
  vowelsConsonantCountForWord = VowelConsonantCount.getVowelsCountForStringList(enteredWords);
  //vowelsCountForWord = VowelConsonantCount.getVowelsCountForStringList(enteredWords);
  //System.out.println(vowelsConsonantCountForWord);
 }

 @Then("I can see the vowels count for each string")
 public void i_can_see_the_vowels_count_for_each_string(Map<String, Integer> countVowels) {
  //assertThat(vowelsCountForWord, is(equalTo(countVowels)));
   //assertThat(vowelsCountForWord, is(equalTo(countVowels)));
 }

 @Then("I can see the vowels and consonant count for each string")
 public void i_can_see_the_vowels_and_consonant_count_for_each_string(DataTable vowelsConsonantCount) {
  System.out.println(vowelsConsonantCount.asMaps());
  vowelsConsonantCountForWord.entrySet().stream()
          //.forEach(item -> System.out.println(item.getKey()));
          .forEach(item ->
                          System.out.println(item.getValue()));
//                          .forEach(val -> System.out.println(val.get("consonant"))));



//  vowelsConsonantCount.asMaps().stream()
//          .forEach(item -> System.out.println(item.get("word")));
//  countVowelsAndConsonants = vowelsConsonantCount.transpose().asList(String.class);
 }
}


