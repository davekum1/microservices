Upload service is deployed in port 9020. (you can change this changing application.properties file)

<b>API available:</b>

http://localhost:9020/upload/customer/{customerId}/document/{documentId}
<br />

This service is slightly different from customer and document. 

It calls customer and document services to populate customer/document data and send it to upload service.

Upload services data are static and pre-defined in the code. However, both customer/document will dynamically changes depending on the data being passed through API.

<b>Running the code</b>

1. Assuming you have already downloaded the source code, open up terminal or command prompt
2. Go to cws-upload folder
3. Type <i>mvn clean package</i>. (Assume if you already have Maven installed, otherwise please download Maven)
4. Type <i>java -jar target/cws-upload-0.1.0.jar</i> (This will launch spring boot and start up your application)
5. Leave your terminal/command prompt window open
6. Go to browser, and type <i>http://localhost:9020/upload/customer/1/document/W2</i> 
