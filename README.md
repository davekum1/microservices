# Microservices

This project is to demonstrate microservices architecture in the most simple form. <br />
It has three main services :
- customer service
- document service
- upload service

<br />Customer service contains customer information and has service to retrieve customer information.
<br />Document service contains document information and has service to retrieve document information.
<br />Upload service call both customer and document services to retrieve customer/document metadata, and pass it upload services.


Each services live as separate entity and does not have code dependency to other services. It is only bound by API contract.

It is utilizing spring boot with embedded tomcat.




