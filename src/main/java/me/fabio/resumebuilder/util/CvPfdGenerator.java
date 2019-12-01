package me.fabio.resumebuilder.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Experience;
import me.fabio.resumebuilder.entity.Participation;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.entity.Projects;
import me.fabio.resumebuilder.entity.References;

@Component
public class CvPfdGenerator {

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
            
            Paragraph expPara = getExperienceDetails(session.getExperience());
            if(expPara != null){
            	document.add(expPara);
            }
            
            Paragraph partPara = getParticipationDetails(session.getParticipation());
            if(partPara != null){
            	document.add(partPara);
            }

            Paragraph proPara = getProjectDetails(session.getProject());
            if(proPara != null){
            	document.add(proPara);
            }
            
            Paragraph refPara = getReferenceDetails(session.getReference());
            if(refPara != null){
            	document.add(refPara);
            }
            
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
		if(e != null) {
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
	
	private static Paragraph getExperienceDetails(Experience exp){
		Paragraph para = null;
		if(exp != null) {
			para = new Paragraph();
			para.add("Employer Name: " + valueOf(exp.getEmployer())+"\n");
			para.add("Designation: " + valueOf(exp.getDesignation())+"\n");
			String dates = valueOf(exp.getJoiningDate()) + " / "+ valueOf(exp.getLeavingDate());
			para.add("Joining Date / Leaving Date: " + dates +"\n");
			String workingExperience = valueOf(exp.getWorking()) + " / "+ valueOf(exp.getYearOfExp());
			para.add("Working / Experience: " + workingExperience +"\n");
			addEmptyLine(para, 4);
		}
		return para;
	}
	
	private static Paragraph getParticipationDetails(Participation part){
		Paragraph para = null;
		if(part != null) {
			para = new Paragraph();
			para.add("Participation Name: " + valueOf(part.getPartName())+"\n");
			para.add("Sponsored by: " + valueOf(part.getSponsores())+"\n");
			para.add("Note: " + valueOf(part.getNote())+"\n");
			para.add("Topic: " + valueOf(part.getTopic())+"\n");
			para.add("Place: " + valueOf(part.getPlace())+"\n");
			addEmptyLine(para, 4);
		}
		return para;
	}
	
	private static Paragraph getProjectDetails(Projects pro){
		Paragraph para = null;
		if(pro != null) {
			para = new Paragraph();
			para.add("Project Title: " + valueOf(pro.getTitle())+"\n");
			para.add("Project Guide: " + valueOf(pro.getGuide())+"\n");
			String frontBackEnd = valueOf(pro.getFrontEnd()) + " / "+ valueOf(pro.getBackEnd());
			para.add("Front End / Back End: " + frontBackEnd +"\n");
			String inputOutput = valueOf(pro.getInputs()) + " / "+ valueOf(pro.getOutputs());
			para.add("Input / Output: " + inputOutput +"\n");
			para.add("Description: " + valueOf(pro.getDescription())+"\n");
			addEmptyLine(para, 4);
		}
		return para;
	}
	
	private static Paragraph getReferenceDetails(References ref){
		Paragraph para = null;
		if(ref != null) {
			para = new Paragraph();
			para.add("Reference Name: " + valueOf(ref.getName())+"\n");
			para.add("Designation: " + valueOf(ref.getDesignation())+"\n");
			para.add("Affiliation: " + valueOf(ref.getAffiliation())+"\n");
			para.add("Email: " + valueOf(ref.getEmailId())+"\n");
			para.add("Contact No#: " + valueOf(ref.getContactNo())+"\n");
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
