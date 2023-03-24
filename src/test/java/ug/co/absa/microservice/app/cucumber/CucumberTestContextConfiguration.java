package ug.co.absa.microservice.app.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import ug.co.absa.microservice.app.IntegrationTest;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
