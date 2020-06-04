### Java Selenium Framework for use with TestModeller.io and Perfecto
Open source repository of Java based selenium tests. For use with [TestModeller.io](http://www.testmodeller.io) and [Perfecto](http://www.Perfecto.io)

This sample project is designed to get you up and running within few simple steps.

Follow along with this [Tutorial](https://testmodeller.io/tutorials/selenium-java/)

Begin with installing the dependencies below, and continue with the Getting Started procedure below.

### Dependencies
There are several prerequisite dependencies you should install on your machine prior to starting to work with this project:

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* An IDE to write your tests on - [Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/marsr) or [IntelliJ](https://www.jetbrains.com/idea/download/#)

* [Maven](https://maven.apache.org/)


Eclipse users should also install:

1. [Maven Plugin](http://marketplace.eclipse.org/content/m2e-connector-maven-dependency-plugin)

IntelliJ IDEA users should also install:

1. [Maven Plugin for IDEA](https://plugins.jetbrains.com/plugin/1166)

TestNG Plugin is built-in in the IntelliJ IDEA, from version 7 onwards.
 
#### Optional Installations
* For source control management, you can install [git](https://git-scm.com/downloads).
* To be able to interact with a real device from Perfecto cloud directly from your IDE, and use Perfecto Reporting, install [Perfecto CQ Lab Plugin](https://www.perfectomobile.com/ni/resources/downloads/add-ins-plugins-and-extensions) for your IDE.

## Downloading the Sample Project

* [Clone](https://github.com/PerfectoMobileSA/Perfecto-TestModeller-Sample.git) the repository.

* After downloading and unzipping the project to your computer, open it from your IDE by choosing the folder containing the pom.xml 

**********************

## Running sample as is

* Register the code templates to Test Modeller following this [tutorial](https://curiositysoftware.ie/Resources/tutorials/ConfigureTMFramework.mp4)
* Copy generated `page objects` into the `Framework\src\main\java\pages` directory. 
* Copy generated `tests` into the `Framework\src\test\java\tests` directory.
* Open CapabilityLoader.java from src/main/java/utilities package</p>

* Search for the below line and replace `<<cloud name>>` with your perfecto cloud name (e.g. demo) or pass it as maven properties: `-DcloudName=<<cloud name>>`</br>  
		&nbsp;&nbsp;	&nbsp;&nbsp; String cloudName = `"<<cloud name>>"`;
		</br>
		</p>
* Search for the below line and replace `<<security token>>` with your perfecto [security token](https://developers.perfectomobile.com/display/PD/Generate+security+tokens) or pass it as maven properties: `-DsecurityToken=<<security token>>` </br></p>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; String securityToken = `"<<security token>>"`;
	</br>

Note: Refer to official documentation on how to execute from eclipse / IntelliJ. </br>
* Run pom.xml with the below maven goals & properties when: </p>
   a. If credentials are hardcoded:
		
		clean
		test
   
   b. If credentials are passed as parameters:
		
		clean
		test
		-DcloudName=${cloudName}
		-DsecurityToken=${securityToken}
		-DtestngXmlFile=testng.xml
</p>

* Maven will automatically kick start the parallel execution of different examples inside perfecto package in parallel </p>

* CI dashboard integration can be performed by supplying the below properties to top-level Maven Targets:

		clean
		test
		-DcloudName=${cloudName}
		-DtestngXmlFile=testng.xml
		-DsecurityToken=${securityToken}
		-Dreportium-job-name=${JOB_NAME} 
		-Dreportium-job-number=${BUILD_NUMBER} 
		-Dreportium-job-branch=${GIT_BRANCH} 
		-Dreportium-tags=${myTag}
