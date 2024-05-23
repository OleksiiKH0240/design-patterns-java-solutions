

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        // Create Chain of responsibility to open file by correct program according to the extension.
        FileOpener middleware = new JpegOpener();

        PngOpener pngOpener = new PngOpener();
        middleware.setNextOpener(pngOpener);

        DocxOpener docxOpener = new DocxOpener();
        pngOpener.setNextOpener(docxOpener);

        DocOpener docOpener = new DocOpener();
        docxOpener.setNextOpener(docOpener);

        XlsOpener xlsOpener = new XlsOpener();
        docOpener.setNextOpener(xlsOpener);

        XlsxOpener xlsxOpener = new XlsxOpener();
        xlsOpener.setNextOpener(xlsxOpener);

        PptxOpener pptxOpener = new PptxOpener();
        xlsxOpener.setNextOpener(pptxOpener);

        PdfOpener pdfOpener = new PdfOpener();
        pptxOpener.setNextOpener(pdfOpener);

        for (String file : files) {
            middleware.openFile(file);
        }


    }
}
