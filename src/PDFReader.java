package PDF_OCR;

class PDFReader{

	private String file_path;

	PDFReader(String location) {
		file_path = location;
		try {
			Class.forName("org.apache.pdfbox");
			System.out.println("Successfully connected PDFBox");
		} catch (Exception e1) {
			System.out.println("Unsuccessful PDFBox connection");
			System.out.println(e1);
			System.exit(1);
		}
	}

}