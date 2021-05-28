package com.amazon.sns.pojo;

public class SNSSubscriptionRequest {
    private String signatureVersion;
    private String type;
    private String topicArn;
    private String message;
    private String unsubscribeURL;
    private String signature;
    private String timestamp;
    private String signingCertURL;
    private String subject;
    private String messageId;

    public String getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopicArn() {
        return topicArn;
    }

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUnsubscribeURL() {
        return unsubscribeURL;
    }

    public void setUnsubscribeURL(String unsubscribeURL) {
        this.unsubscribeURL = unsubscribeURL;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSigningCertURL() {
        return signingCertURL;
    }

    public void setSigningCertURL(String signingCertURL) {
        this.signingCertURL = signingCertURL;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "SNSSubscriptionRequest{" +
                "signatureVersion='" + signatureVersion + '\'' +
                ", type='" + type + '\'' +
                ", topicArn='" + topicArn + '\'' +
                ", message='" + message + '\'' +
                ", unsubscribeURL='" + unsubscribeURL + '\'' +
                ", signature='" + signature + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", signingCertURL='" + signingCertURL + '\'' +
                ", subject='" + subject + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}
