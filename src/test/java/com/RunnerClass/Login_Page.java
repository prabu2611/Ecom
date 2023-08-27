package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/Feature_File/Login.feature",
		
		glue = {"com.stepDefi"}
		
		)


//Hooks -> Pre and Post
//Background -> Only Pre Condition 

//Hooks More priority

//Order ->Before -> Ascending Order  1,2,3....
//order ->After -> Descending Order  3,2,1,....



/*'
 * 
 * Feature File -> Feature , Scenario , Given ,When , Then , And ,But,Scenario Outline, Example ,DataTable
 * Step Definition
 * Runner Class -> Runwith(Cucumber.class) -> Junit
 * 
 * Cucumber Option -> 
 * 
 * feature
 * glue
 * monochrome
 * dryRun
 * publish
 * plugin
 * Snippet
 * tags
 * hooks
 * background
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */









public class Login_Page {

}
