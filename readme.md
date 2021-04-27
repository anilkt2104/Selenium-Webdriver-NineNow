# Selenium-Webdriver-NineNow

Selenium-Webdriver-NineNow is a maven test framework intended to be integrated to build pipeline. 
Though this can integrated to the pipeline, please note that Test Environments / properties yet to be handled.

## Installation

The test framework works fine with:
	- java version 1.8.0_241
	- apache-maven-3.8.1
	- selenium webdriver 3.141.59	
	- testng 7.4.0
	- allure 2.13.9

Please install and configure environment variables for JAVA, MAVEN and Allure for reporting.
The dependencies for Selenium, TestNG and Allure have already been added in pom.xml

## Execution
	1. Please execute the command "mvn clean test" from command line. This should execute the test framework project
	2. After the test complete please go to the project directory and issue command "allure serve" to see the report.