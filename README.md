

# This is the code for transferring files between the server and the server.


## Usage


	MultipartUtility multipartUtility = new MultipartUtility(URL);

	//Append Data
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

	//Append Files
	multipartUtility.addFilePart("1", uploadFile);
	multipartUtility.addFilePart("2", uploadFile2);

	String responseText = multipartUtility.finish();

	System.out.println(responseText);
