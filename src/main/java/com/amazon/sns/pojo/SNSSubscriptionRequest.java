package com.amazon.sns.pojo;

public class SNSSubscriptionRequest {
	private String subscribeURL;
	private String signatureVersion;
	private String type;
	private String topicArn;
	private String message;
	private String signature;
	private String token;
	private String timestamp;
	private String signingCertURL;
	private String messageId;

	public String getSubscribeURL(){
		return subscribeURL;
	}

	public String getSignatureVersion(){
		return signatureVersion;
	}

	public String getType(){
		return type;
	}

	public String getTopicArn(){
		return topicArn;
	}

	public String getMessage(){
		return message;
	}

	public String getSignature(){
		return signature;
	}

	public String getToken(){
		return token;
	}

	public String getTimestamp(){
		return timestamp;
	}

	public String getSigningCertURL(){
		return signingCertURL;
	}

	public String getMessageId(){
		return messageId;
	}
}
