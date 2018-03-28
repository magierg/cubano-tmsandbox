# cubano-template

Quick start template for projects wishing to use the Cubano framework.

If you are working behind a proxy, the ensure you work through the next section 'Dealing with Proxies'.   

## Dealing with Proxies
* Gradle >  For an initial example, see gradle.properies, in the root directory, and update the 'systemProp.*' 
  parameters as required. For additional configuration options see 'https://docs.gradle.org/current/userguide/build_environment.html#sec:accessing_the_web_via_a_proxy'
* Service and Browser Testing > For an initial example, see config.properies, in the root directory, and update 
  the 'proxy.*' parameters as required. Further see 'org.concordion.cubano.config.ProxyConfig'

## This is a gradle project - Useful Gradle Commands

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

