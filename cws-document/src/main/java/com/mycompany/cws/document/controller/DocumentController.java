package com.mycompany.cws.document.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.cws.document.domain.Document;

@Controller
@RequestMapping("/document")
public class DocumentController {
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public @ResponseBody List<Document> getAllDocuments() {
		List<Document> documentList = createDocuments();	
		return documentList;
	}
	
	@RequestMapping(value="/findById/{id}", method=RequestMethod.GET)
	public @ResponseBody Document getDocument(@PathVariable String id) {
		Document document = findDocument(id);
		if (document != null) {
			return document;	
		} else {
			document = new Document("Id not found", "Name not found", "Metadata not found");
			return document;
		}
	}
	
	/**
	 * Find document by documentId from static list
	 * @param id
	 * @return
	 */
	private Document findDocument(String id) {
		List<Document> documentList = createDocuments();		
		for (Document document : documentList) {
			if (document.getDocumentId().equals(id)) {
				return document;
			}
		}		
		return null;
	}

	/**
	 * Create static list of documents
	 * @return
	 */
	private List<Document> createDocuments() {
		List<Document> documentList = new ArrayList<Document>();
		Document document1 = new Document("W2","W2 Document", "And many other W2 metadata");
		Document document2 = new Document("1040","1040 Document", "And many other 1040 metadata");	
		documentList.add(document1);
		documentList.add(document2);
		
		return documentList;
	}
	

}
