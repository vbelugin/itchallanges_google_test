# itchallanges_google_test
Task for IT_Challanges - simple Selenium script for Google Search


Prerequisites:
Windows/Linux/MacOS machine, latest Java JDK installed, IntelliJ IDEA installed (optional)

How to run:
Clone the project OR unarchive ZIP (depending how you got the project, from GitHub or from ZIP file)
If no IntelliJ IDEA installed - execute "./gradlew clean test -Dbrowser=chrome" (or -Dbrowser=firefox") command from commandline in root project folder (where gradlew file is)
If IntelliJ IDEA installed - import project to Idea as Gradle project, run with jUnit ItChallengesGoogleTest class in src/test/java/com.google.tests, browser parameter (-Dbrowser=chrome") should be specified for run configuration

Additional info:
No comments were added because code is simple and easily readable