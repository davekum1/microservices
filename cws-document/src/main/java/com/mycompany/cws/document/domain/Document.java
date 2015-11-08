package com.mycompany.cws.document.domain;

public class Document {
	
	public String documentId;
	public String documentName;
	public String documentMetadata;
	
	public Document(String documentId, String documentName, String documentMetadata) {
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentMetadata = documentMetadata;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentMetadata() {
		return documentMetadata;
	}

	public void setDocumentMetadata(String documentMetadata) {
		this.documentMetadata = documentMetadata;
	}
	
}
