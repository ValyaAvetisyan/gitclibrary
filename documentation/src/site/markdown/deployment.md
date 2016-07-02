# Gitc library application Deployment
---

## Requirements for deployment

- Apache Tomcat 8+ version
- MySQL 5.6+ server


## Steps to deploy

- Set correct values in core\src\main\resources\db.properties (database.url, database.username and
  database.password should match your setup)
- Build entire project (step 1.2)
- Copy $SOURCE_ROOT\Client\target\client.war and $SOURCE_ROOT\Rest\api\target\restapi.war files
  to $CATALINA_HOME\webapps directory
- Go to $CATALINA_HOME\bin and run "startup" executable file.
- Open Browser and request "http://your_host:8080/login" url

