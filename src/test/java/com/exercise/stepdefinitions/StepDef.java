package com.exercise.stepdefinitions;

import com.exercise.VowelConsonantCount;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDef {
 VowelConsonantCount count = new VowelConsonantCount();


 @Given("the following strings")
 public void the_following_strings(DataTable vowelsTable) throws Exception {
  List<String> list = vowelsTable.transpose().asList(String.class);
  System.out.println(VowelConsonantCount.getVowelsCountForString(list));
 }

 @When("I input the strings as arguments to the program")
 public void i_input_the_strings_as_arguments_to_the_program() {
  // count.main(array);
 }

 @Then("I can see the vowels count for each string")
 public void i_can_see_the_vowels_count_for_each_string(DataTable dataTable) {

 }
}


