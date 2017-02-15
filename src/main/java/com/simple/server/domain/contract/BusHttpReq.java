package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AContract;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusHttpReq.class)
public class BusHttpReq extends AContract {

	String contextPath;

	String contentType;

	String localAddr;

	String localName;

	String method;

	String pathInfo;

	String protocol;

	String queryString;

	String remoteAddr;

	String remoteHost;

	String remotePort;

	String remoteUser;

	String serverName;

	String serverPort;

	String requestURL;

	protected String incomingDatetime;

	@Override
	public String getClazz() {
		return null;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getLocalAddr() {
		return localAddr;
	}

	public void setLocalAddr(String localAddr) {
		this.localAddr = localAddr;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPathInfo() {
		return pathInfo;
	}

	public void setPathInfo(String pathInfo) {
		this.pathInfo = pathInfo;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getRemoteAddr() {
		return remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	public String getRemoteHost() {
		return remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	public String getRemotePort() {
		return remotePort;
	}

	public void setRemotePort(String remotePort) {
		this.remotePort = remotePort;
	}

	public String getRemoteUser() {
		return remoteUser;
	}

	public void setRemoteUser(String remoteUser) {
		this.remoteUser = remoteUser;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public String getIncomingDatetime() {
		return incomingDatetime;
	}

	public void setIncomingDatetime(String incomingDatetime) {
		this.incomingDatetime = incomingDatetime;
	}

	@Override
	public String toString() {
		return "BusHttpReq [contextPath=" + contextPath + ", contentType=" + contentType + ", localAddr=" + localAddr
				+ ", localName=" + localName + ", method=" + method + ", pathInfo=" + pathInfo + ", protocol="
				+ protocol + ", queryString=" + queryString + ", remoteAddr=" + remoteAddr + ", remoteHost="
				+ remoteHost + ", remotePort=" + remotePort + ", remoteUser=" + remoteUser + ", serverName="
				+ serverName + ", serverPort=" + serverPort + ", requestURL=" + requestURL + ", incomingDatetime="
				+ incomingDatetime + "]";
	}

}
