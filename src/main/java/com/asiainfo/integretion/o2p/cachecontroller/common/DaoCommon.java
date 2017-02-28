package com.asiainfo.integretion.o2p.cachecontroller.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.o2p.common.util.Constant;

public final class DaoCommon {
	private static final Log log = LogFactory.getLog(DaoCommon.class);
	
	private DaoCommon(){}
	
	public static String getLongText(Object xsdFormatObj){
		String xmlDoc = "";
		InputStream is = null;
		if(xsdFormatObj instanceof byte[] ) {
			byte[] 	fileBytes = (byte[])xsdFormatObj;
			try {
				xmlDoc = new String(fileBytes, Constant.UTF8);
			} catch (UnsupportedEncodingException e) {
				log.error("get long text error!", e);
			}
		} else if (xsdFormatObj instanceof java.sql.Clob ) {
			java.sql.Clob xsdFormatClob = (java.sql.Clob)xsdFormatObj;
			byte[] data = null;
			try {
				int len = (int) xsdFormatClob.length();
				data = new byte[len];
				is = xsdFormatClob.getAsciiStream();
				if(is.read(data)==-1){
					throw new IOException();
				}
			} catch (SQLException e) {
				log.error("SQLException:"+e.getMessage()+",errorCode:"+e.getErrorCode());
			} catch (IOException e) {
				log.error("IOException:"+e.getMessage());
			} finally{
				if(is!=null){
					try {
						is.close();
					} catch (IOException e) {
						log.error("IOException:"+e.getMessage());
					}
				}
			}
			if(data != null) {
				try {
					xmlDoc = new String(data, Constant.UTF8);
				} catch (UnsupportedEncodingException e) {
					log.error("convert from byte array to string error!", e);
				}
			}
		} else if(xsdFormatObj instanceof String ) {
			xmlDoc = xsdFormatObj.toString();
		}
		return xmlDoc;
	}
}
