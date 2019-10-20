package com.cucumber.runner;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options(features="src/com/cucumber/features",
glue={"com.cucumber.steps"})//,tags="@tag1,@tag2")//,dryRun=true)
public class KartRunner {

}
