Document service is deployed in port 9010. (you can change this changing application.properties file)

<b>API available:</b>

http://localhost:9010/document/findById/{documentId}

http://localhost:9010/document/list
 
Document data are static and pre-defined in the code. If you prefer, you can hook this up with database of your preference.

<b>Running the code</b>

1. Assuming you have already downloaded the source code, open up terminal or command prompt
2. Go to cws-document folder
3. Type <i>mvn clean package</i>. (Assume if you already have Maven installed, otherwise please download Maven)
4. Type <i>java -jar target/cws-document-0.1.0.jar</i> (This will launch spring boot and start up your application)
5. Leave your terminal/command prompt window open
6. Go to browser, and type <i>http://localhost:9010/document/findById/W2</i> or <i>http://localhost:9010/document/list</i>

