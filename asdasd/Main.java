package com.brain.multipartUtility;

import java.io.File;
import java.net.URLEncoder;

public class Main {
	
	private final static String URL  ="http://192.168.3.26:7700/test/default.aspx";
	
	public static void main(String[] args) throws Exception {
		
		MultipartUtility multipartUtility = new MultipartUtility(URL);
		
		multipartUtility.addFormField("salesNo", "S1312060000035");
		multipartUtility.addFormField("lessonDt", "2019.02.20");
		multipartUtility.addFormField("empNo", "430226005");
		multipartUtility.addFormField("idx", "");
		multipartUtility.addFormField("desc", URLEncoder.encode("업로드 해줘요", "UTF-8"));
		multipartUtility.addFormField("lcIdx", "463");
		multipartUtility.addFormField("mode", "insert");
		multipartUtility.addFormField("userId", "430226005");
		
		File uploadFile = new File("C:\\Users\\JES89\\Desktop\\1.txt");
		File uploadFile2 = new File("C:\\Users\\JES89\\Desktop\\1.gif");
		
		
		multipartUtility.addFilePart("1", uploadFile);
		multipartUtility.addFilePart("2", uploadFile2);
		
		System.out.println(multipartUtility.finish());
		
	}
	





}