package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/Feature_File/X.feature",
		
		glue = {"com.stepDefi"},
		
		dryRun = !true
		
		//tags="@test"
		
		
		
		//Hooks - @Before @After
		
		//monochrome = true,
		
		//publish = true,
		
		//plugin = {"pretty","html:htmlreports/html.html"},
		
		//snippets = SnippetType.CAMELCASE
		
		
		
		
		
		)
public class Adactin_Login {

}
