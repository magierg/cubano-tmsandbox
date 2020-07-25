# Trademe Sandbox Test Project

I have used [Cubano framework](https://github.com/concordion/cubano) when writing the tests as it provides many cool features out of the box plus wanted to try it.

You should be able to run the tests either from IDE or command line using gradle wrapper:

```
./gradlew clean test
```
After the run you should be able to access the test report in

```
/cubano-tmsandbox/build/reports/spec/trademe/TradeMeTests.html
```

I haven't removed TM Oauth values from the code (obviously not a good practice) to makes it easier to run. 
