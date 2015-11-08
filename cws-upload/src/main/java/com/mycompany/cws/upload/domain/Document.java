package com.mycompany.cws.upload.domain;

public class Document {
	
	public String documentId;
	public String documentName;
	public String documentMetadata;
	
	public Document() {		
	}
	
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

	@Override
	public String toString() {
		return "Document [documentId=" + documentId + ", documentName="
				+ documentName + ", documentMetadata=" + documentMetadata + "]";
	}

	
}
