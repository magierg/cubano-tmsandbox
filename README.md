# Trademe Sandbox Test Project

[![Build Status](https://travis-ci.com/magierg/cubano-tmsandbox.svg?branch=master)](https://travis-ci.com/magierg/cubano-tmsandbox)

The project have been created using [Cubano framework](https://github.com/concordion/cubano) template.

You should be able to run the tests either from IDE or command line using gradle wrapper:

```
./gradlew clean test
```
After the run you should be able to access the test report in

```
/cubano-tmsandbox/build/reports/spec/trademe/TradeMeTests.html
```
You can also access the report created by a Travis build server [here](https://magierg.github.io/cubano-tmsandbox/trademe/TradeMeTests.html)

The TM Oauth values haven't been removed from the repo (obviously not a good practice) to makes it easier to run locally. 
