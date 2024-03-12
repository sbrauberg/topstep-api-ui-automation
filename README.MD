# topstep-ui-api-automation
# Cucumber Hybrid Framework (BDD)

# Tech stack:
1. Java (openjdk v21.0.2)
2. Maven (v3.9.5)
3. Selenium (v4.18.1)
4. Cucumber-Java/Cucumber-JUnit (v7.14.0)
5. RestAssured (v5.4.0)


# Prerequisites

- [Java](https://www.java.com/en/download/help/download_options.html) JDK 9 or higher
- [Maven](https://maven.apache.org/install.html) 3.6.3 or higher 
  - [MacOS](https://www.baeldung.com/install-maven-on-windows-linux-mac)
  - [Windows](https://www.digitalocean.com/community/tutorials/install-maven-mac-os)
- [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) 2.38.1 or higher
- [Allure Report](https://allurereport.org/docs/gettingstarted-installation/) 2.27.0 or higher
- [Chromedriver](https://googlechromelabs.github.io/chrome-for-testing/) v122.0.6261.112 or higher

  

# Running test suite:
`mvn test -Dtest=CukesRunner.java`

# Reports
- navigate to the repo directory `cd topstep-ui-api-automation`
- run `allure serve allure-results` 

