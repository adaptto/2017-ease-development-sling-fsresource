adaptTo() 2017 - Ease Development with Apache Sling File System Resource Provider
=================================================================================

Code samples for talk at adaptTo() 2017 in Berlin:<br/>
https://adapt.to/2017/en/schedule/ease-development-with-apache-sling-file-system-resource-provider.html


Requirements
------------

* Java 8
* Maven 3.3.9
* AEM 6.1, 6.2 or 6.3 running on port 4502


Try it out
----------

* Deploy the sample application to your local AEM instance using the script `clean_install_deploy_package.sh`
  * This does a full `mvn clean install` and then uploads the content packages from `content-packages`
* Open the sample site at http://localhost:4502/editor.html/content/adaptto-fsresource-sample/en.html


Enable File System Resource Provider
------------------------------------

* Go to `bundles/core' and execute
```
mvn sling:fsmount
```
* Go to `content-packages/sample-content' and execute
```
mvn sling:fsmount
```
* Changes you are now doing on application content files in the bundle, or FileVault XML files in the sample content package are reflected immediately in the AEM instance.
