# cubano-template

Quick start template for projects wishing to use the Cubano framework. This generates living documentation for basic web and API services.

## Features

A goal of Cubano is to generate living documentation that is applicable to a wide audience.

With the specifications written in plain language, and styled using Concordion, the generated [living documentation](https://concordion.github.io/cubano-template/example/Example.html) is readable by anyone:

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/spec.png" alt="image of documentation" width="40%">

The storyboard feature allows users to easily see the steps that are performed to implement the specification, and has proven useful for product owners, analysts and training staff:

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/storyboard-link.png" alt="image of documentation" width="30%">

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/storyboard-expanded.png" alt="image of documentation" width="60%">

It is also useful for showing the contents of API messages:

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/api.png" alt="image of documentation" width="60%">

Finally, the living documentation includes log messages that are useful for developers and test developers:

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/log-links.png" alt="image of documentation" width="20%">

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/log.png" alt="image of documentation" width="70%">

> <img src="https://github.com/concordion/cubano/raw/master/docs/img/log-image.png" alt="image of documentation" width="70%">


## Dealing with Proxies
If working from behind a proxy, then you will need to manage some proxy configuration as specified below, for Gradle, Service and Browser Testing, and Eclipse.

* Gradle >  For an initial example, see gradle.properies, in the root directory, and update the 'systemProp.*' 
  parameters as required. For additional configuration options see 'https://docs.gradle.org/current/userguide/build_environment.html#sec:accessing_the_web_via_a_proxy'
* Service and Browser Testing > For an initial example, see config.properies, in the root directory, and update 
  the 'proxy.*' parameters as required. You must set 'proxy.required = true' to use any format of proxy configuration. For additional configuration options see 'org.concordion.cubano.config.ProxyConfig'
* Eclipse > Window > Preferences > General > Network Connections
	* Add Manual for Http and Https: 
		* host: [proxyHost]
		* port: [proxyPort]
		* authentication: required
		* proxy bypass: [hostsToBypass]
  
## Example project set up
* Install Git (or use via Eclipse)
* Install Eclipse
* Create Directories:
	* D:\Java
	* D:\Java\workspace\workspace_CubanoTemplate
	* D:\Java\gradle_user_home
	* D:\Java\source_code
	
* Set Environment Variable:
	* Set a Gradle Home variable. Open a command prompt and type > 'SETX GRADLE_USER_HOME D:\Java\gradle_user_home'

* Install Firefox.  The default browser used in this template project is Firefox

* Open a command prompt to > D:\Java\source_code
	* type 'git clone [https://github.com/concordion/cubano-template.git]

* Open Eclipse and Import Project as an 'Existing Gradle Project'

## This template is a Gradle project - Useful Gradle Commands
On the command line:
* To execute tests >  gradlew clean test -Dtest.single=org/concordion/cubano/template/specification/Specification
* To execute a Checkstyle/Findbugs build > gradlew check -x test

## Contributing (or Setting Up your Own Project to use CheckStyle/Findbugs)

All contributions are welcome, we do ask however that you follow our coding standards.  This is rather easy as we have checkstyle and code formatter configuration files ready to use.

For eclipse:

1. Install findbugs plugin

1. Install checkstyle plugin

1. Eclipse > Preferences > Checkstyle > New...

    Type: External configuration file
    Name: Cubano
    Location: <workspace>/cubano/config/checkstyle/checkstyle.xml

1. Eclipse > Preferences > Java > Code Style > Formatter > Import...

    File: <workspace>/cubano/config/formatter/formatter.xml

1. Eclipse > Preferences > Java > Editor > Save Actions

    Perform the selected actions on save: Checked
    Format source code: Format edited lines
    Organise imports: Checked

1. Eclipse > Project > Properties > Checkstyle

    Checkstyle active for this project: Checked
    Use the following check configuration for all files: Cubano - (Global)

