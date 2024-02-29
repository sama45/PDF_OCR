package PDF_OCR;

class PDF_OCR{

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please enter file location:");
			String location = System.console().readLine();
		} else {
			String location = args[0];
		}
		reader = new PDFReader(location);

	}
}