package com.mycompany.cws.upload.domain;

import java.util.Date;

public class Upload {

	private String uploadId;
	private Date uploadDate;
	private Customer customer;
	private Document document;
	
	public Upload(){		
	}
	
	public Upload(String uploadId, Date uploadDate, Customer customer, Document document) {
		this.uploadId = uploadId;
		this.uploadDate = uploadDate;
		this.customer = customer;
		this.document = document;
	}

	public String getUploadId() {
		return uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "Upload [uploadId=" + uploadId + ", uploadDate=" + uploadDate
				+ ", customer=" + customer + ", document=" + document + "]";
	}
	
	
}
