# Selenium-Java-TestNG-UI-Framework
Test Automation framework for web UI testing using Java, Selenium, TestNG, Cucumber, and uses BDD model
This project is a framework to be used as the base for automation for web UI and some applying simple tests on "Google" search engine. 

### Important:
-    Framework structure is based on Page Object Model (POM)
-   This framework uses Cucumber, Selenium, and TestNG.
-   The reports contain Screenshots after each step and can be changed to be after each scenario.

In POM the pages' package contains only the methods related to reading and writing from the page contents but any logic should be written in the step definition page, as this will help with increasing the reusability of the pages and remove unneeded dependency 

To use this framework efficiently the pages of the website should be added as needed to the pages package as this framework is based on POM
![pages package](ReadMe%20Images/Framework%20brakedown/Pages%20Package.jpg)

and if there is any common methods related to browser actions that will be usesd on every page they should be added the "BrowserAction" class.
![Browser Action class](ReadMe%20Images/Framework%20brakedown/Browser%20Actions%20class.jpg)

### To viewthe screenshots please follow the steps below:
![Step 1](ReadMe%20Images/Open%20reports%20steps/Step%201.png)
![Step 2](ReadMe%20Images/Open%20reports%20steps/Step%202.png)
![Step 3](ReadMe%20Images/Open%20reports%20steps/Step%203.png)
![Step 4](ReadMe%20Images/Open%20reports%20steps/Step%204.png)
![Step 5](ReadMe%20Images/Open%20reports%20steps/Step%205.png)
