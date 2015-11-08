package com.mycompany.cws.upload.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.mycompany.cws.upload.domain.Customer;
import com.mycompany.cws.upload.domain.Document;
import com.mycompany.cws.upload.domain.Upload;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public @ResponseBody String getAllUpLoad() {
		return "It works";
	}
	
	@RequestMapping(value="/customer/{customerId}/document/{documentId}", method=RequestMethod.GET)	
	public @ResponseBody Upload doUpload(@PathVariable String customerId, @PathVariable String documentId) {
		
		//Calling customer service
		Customer customer = restTemplate.getForObject("http://localhost:9000/customer/findById/{customerId}", 
														Customer.class,
														customerId);
		//Calling document service												
		Document document = restTemplate.getForObject("http://localhost:9010/document/findById/{documentId}", 
				Document.class,
				documentId);

		//We are creating dummy upload object which has dynamic value from customer/document, but rest are static
		Upload upload = new Upload();
		upload.setUploadId("123");
		upload.setUploadDate(new Date());
		upload.setCustomer(customer);
		upload.setDocument(document);
		
		return upload;
				
	}

}
