package me.fabio.resumebuilder.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.repository.EducationRepository;
import me.fabio.resumebuilder.repository.ExperienceRepository;
import me.fabio.resumebuilder.repository.ParticipationRepository;
import me.fabio.resumebuilder.repository.PersonalRepository;
import me.fabio.resumebuilder.repository.ProjectsRepository;
import me.fabio.resumebuilder.repository.ReferencesRepository;

@Component
public class CvPfdGenerator {

	@Autowired PersonalRepository repo;
	@Autowired EducationRepository eduRepo;
	@Autowired ExperienceRepository expRepo;
	@Autowired ParticipationRepository partRepo;
	@Autowired ProjectsRepository proRepo;
	@Autowired ReferencesRepository refRepo;
	
	public ByteArrayInputStream generate(UserSession session){
		Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
        	
        	PdfWriter.getInstance(document, out);
            document.open();
            
            //heading
            Paragraph p = new Paragraph();
            p.add("Curriculum Vitae");
            p.setAlignment(Element.ALIGN_CENTER);
            addEmptyLine(p, 2);
            document.add(p);
            
            //personal
            Paragraph persoanalPara = getPersonalDetails(session.getPersonal());
            if(persoanalPara != null){
            	document.add(persoanalPara);
            }
            
            Paragraph eduPara = getEducationalDetails(session.getEducation());
            if(eduPara != null){
            	document.add(eduPara);
            }

            Paragraph p2 = new Paragraph();
            p2.add("This is my paragraph 2"); //no alignment

            document.add(p2);
//
//            Font f = new Font();
//            f.setStyle(Font.BOLD);
//            f.setSize(8);
//
//            document.add(new Paragraph("This is my paragraph 3", f));
//            
            document.close();

        } catch (DocumentException ex) {
            System.out.println("Error occurred: "+ ex);
        }

        return new ByteArrayInputStream(out.toByteArray());
	}
	
	private static Paragraph getPersonalDetails(Personal p) {
		Paragraph para = null;
		if(p != null) {
			para = new Paragraph();
			String fullName = (p.getName() + " " + valueOf(p.getFatherName())).toUpperCase();
			para.add(fullName+"\n");
			para.add("Mobile No: " + valueOf(p.getMobileNo())+"\n");
			para.add("Language Known: " + valueOf(p.getLangaugeProf())+"\n");
			para.add("Hobbies: " + valueOf(p.getHobbies())+"\n");
			addEmptyLine(para, 4);
		}
		return para;
	}
	
	private static Paragraph getEducationalDetails(Education e) {
		Paragraph para = null;
		System.out.println(e);
		if(e != null) {
			System.out.println("not null");
			para = new Paragraph();
			para.add("College Name: " + valueOf(e.getCollegeName())+"\n");
			para.add("Subject : " + valueOf(e.getSubject())+"\n");
			para.add("Board / University: " + valueOf(e.getBoard())+"\n");
			String marskAndTotal = valueOf(e.getObtainedMarks()) + " " + valueOf(e.getTotalMarks());
			para.add("Marks / Total: " + marskAndTotal+"\n");
			addEmptyLine(para, 4);
		}
		return para;
	}
	
	private static Font bold() {
		Font f = new Font();
        f.setStyle(Font.BOLD);
        f.setSize(8);
        return f;
	}
	
	private static String valueOf(String v) {
		return (v !=null) ? v : "";
	}
	
	private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
	
}
