use maven repository to get more dependencies. copy the text to Pom.xml

Use bootstrap from getbootstrap.com to do javascript and html and css. No need to do css yourself

# MAVEN COMPILER COMMANDS.
in project root folder

mvnw.cmd clean 

package the compiled bytecode classes into jar file
mvnw.cmd package

this deletes the "/target" folder and redownloads the dependencies, recompiles it to class files and package to jar.
mvnw.cmd clean package

run the application in embedded local server, it downloads the dependencies and runs. Apache web server
mvnw.cmd spring-boot:run
mvn spring-boot:run -Dserver.port=3000

# To set the arguments when running maven
• mvn spring-boot:run -Dspring-boot.run.arguments=--port=3000
<space>--logLevel=TRACE”





the railway may fail because it only works for java 17 and earlier. to make it work, must ownself dockerize it and then run.

in command prompt, to deploy to railway
railway login
railway link       -- links railway to the project
railway up         -- runs the project in railway

Once the project is deployed, go to railway>Settings generate publicdomain to make it public and have URL
use postman to act as a client to probe the website and see what is returned by the server