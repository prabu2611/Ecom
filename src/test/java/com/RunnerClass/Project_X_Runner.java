package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature_File/ProjectX.feature",
		glue = "com.stepDefi",
		tags = "@Positive or @Negative"
//		snippets = SnippetType.CAMELCASE,
//		dryRun = !true,
//		monochrome = !true,
//		publish = true,
//		plugin = {"pretty","html:Html/WebReport.html","json:JsonReport/Jreport.json"}
		
		
		)


//tags -> group
//feature level
//scenario level
//combine 

public class Project_X_Runner {

}
