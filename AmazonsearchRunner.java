package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\feature\\amazonsearch.feature",
		glue = "com\\stepdef",
		monochrome = true,
		stepNotifications = true
		)
public class AmazonsearchRunner {

}
