package uitec;


import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by campitos on 7/07/15.
 */
@Controller
@RequestMapping("/")
public class ControladorPFD {
/*
CARGAMOS SOMERVILLE
 */
    @CrossOrigin
    @RequestMapping(value="/cargar-somerville/a1analisis", method = RequestMethod.GET, headers={"Accept=text/html"} )
    public @ResponseBody
    byte[] cargarSomerville(HttpServletResponse response)throws Exception{
        String mensaje="Aun nada";
        File filesillo=new File("a1analisis.pdf");
        PdfReader reader=new PdfReader("/home/campitos/Downloads/somerville.pdf");
        PdfReader.unethicalreading = true;

       mensaje=""+ reader.getNumberOfPages();
        reader.selectPages("23-41");
        Document document=new Document();
        //Creamos el archivo resultado:
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(filesillo));
        document.open();
        PdfPTable table=new PdfPTable(1);
        int n = reader.getNumberOfPages();
        PdfImportedPage page;
        for (int i = 1; i <= n; i++) {
            page = writer.getImportedPage(reader, i);
            table.addCell(Image.getInstance(page));
        }
        document.add(table);
        document.close();


        byte[] bytes= FileCopyUtils.copyToByteArray(filesillo);
        System.out.println("Recobrando correctamente con este metodo del todo nuevo");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filesillo.getName() + "\"");
        response.setContentLength(bytes.length);
        response.setContentType("application/pdf");
        return bytes;
    }
/*
CARGAMOS KENDALL
 */
    @CrossOrigin
    @RequestMapping(value="/cargar-kendall/a1analisis", method = RequestMethod.GET, headers={"Accept=text/html"} )
    public @ResponseBody
    byte[] cargarKendall(HttpServletResponse response)throws Exception{
        String mensaje="Aun nada";
        File filesillo=new File("a1analisiskendall.pdf");
        PdfReader reader=new PdfReader("/home/campitos/Downloads/kendall.pdf");
        PdfReader.unethicalreading = true;

        mensaje=""+ reader.getNumberOfPages();
        reader.selectPages("52-74");
        Document document=new Document();
        //Creamos el archivo resultado:
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(filesillo));
        document.open();
        PdfPTable table=new PdfPTable(1);
        int n = reader.getNumberOfPages();
        PdfImportedPage page;
        for (int i = 1; i <= n; i++) {
            page = writer.getImportedPage(reader, i);
            table.addCell(Image.getInstance(page));
        }
        document.add(table);
        document.close();


        byte[] bytes= FileCopyUtils.copyToByteArray(filesillo);
        System.out.println("Recobrando correctamente con este metodo del todo nuevo");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filesillo.getName() + "\"");
        response.setContentLength(bytes.length);
        response.setContentType("application/pdf");
        return bytes;
    }

    @CrossOrigin
    @RequestMapping(value="/cargar-pressman/a1analisis", method = RequestMethod.GET, headers={"Accept=text/html"} )
    public @ResponseBody
    byte[] cargarPressman(HttpServletResponse response)throws Exception{
        String mensaje="Aun nada";
        File filesillo=new File("a1analisispressman.pdf");
        PdfReader reader=new PdfReader("/home/campitos/Downloads/pressman.pdf");
        PdfReader.unethicalreading = true;

        mensaje=""+ reader.getNumberOfPages();
        reader.selectPages("42-48");
        Document document=new Document();
        //Creamos el archivo resultado:
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(filesillo));
        document.open();
        PdfPTable table=new PdfPTable(1);
        int n = reader.getNumberOfPages();
        PdfImportedPage page;
        for (int i = 1; i <= n; i++) {
            page = writer.getImportedPage(reader, i);
            table.addCell(Image.getInstance(page));
        }
        document.add(table);
        document.close();


        byte[] bytes= FileCopyUtils.copyToByteArray(filesillo);
        System.out.println("Recobrando correctamente con este metodo del todo nuevo");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filesillo.getName() + "\"");
        response.setContentLength(bytes.length);
        response.setContentType("application/pdf");
        return bytes;
    }


}
