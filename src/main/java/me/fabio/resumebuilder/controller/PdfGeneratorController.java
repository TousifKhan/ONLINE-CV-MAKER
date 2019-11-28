package me.fabio.resumebuilder.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import me.fabio.resumebuilder.util.CvPfdGenerator;
import me.fabio.resumebuilder.util.UserSession;

@Controller
public class PdfGeneratorController {

	@RequestMapping(value = "/pdf-generation", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ModelAndView viewPdfScreen(
    		Map<String, Object> model, HttpServletRequest request) {
		
		UserSession session = UserSession.getSession(request);
		//TODO check session value here
        return new ModelAndView("pdf-generation", model);
    }
	
	
	@RequestMapping(value = "/generation", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> generate() {

        ByteArrayInputStream bis = CvPfdGenerator.generate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
	
	@RequestMapping(value="/getpdf", method=RequestMethod.GET)
    public void generatePdf(HttpServletResponse response) throws IOException {
        ByteArrayInputStream bis = CvPfdGenerator.generate();
        FileCopyUtils.copy(bis, response.getOutputStream());
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=online-cv.pdf");
        response.flushBuffer();
    }
	

}
