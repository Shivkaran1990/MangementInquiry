package com.inq.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.inq.dao.InquiryService;

	
/**
 * @author imssbora
 */
@Controller
public class FileUploadController {
	@Autowired
	InquiryService inquiryService;

	//@GetMapping("/getInq")
	@RequestMapping(value = "/getInq/{id}", method = RequestMethod.GET)
	//@ResponseBody
	public String getDataBasedOnID(@PathVariable("id") String id,Model model) {
		List<Inquiry> inqs=inquiryService.getInqData(id);
		model.addAttribute("inqdetails", inqs.get(0));

		return "home";
	}

	@RequestMapping(value = "/inq/update", method = RequestMethod.PUT)
	public String updateInq(@ModelAttribute("Inquiry") Inquiry inq) {

		this.inquiryService.updateInquiry(inq);

		return "home";

	}

	@GetMapping("/")
	public String gethome(String Id) {
		return "home";
	}
	@GetMapping("/home")
	public String home(String Id) {
		return "home";
	}
	@GetMapping("/upload")
	public String uploadform(String Id) {
		return "fileUploadForm";
	}

	// Handling file upload request
	@PostMapping("/fileUpload")
	public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file) throws IOException {

		// Save file on system
		if (!file.getOriginalFilename().isEmpty()) {
			/*
			 * BufferedOutputStream outputStream = new BufferedOutputStream( new
			 * FileOutputStream( new File("D:/Upload", file.getOriginalFilename())));
			 * outputStream.write(file.getBytes()); outputStream.flush();
			 * outputStream.close();
			 */

			InputStream in = file.getInputStream();
			File currDir = new File(".");
			String path = currDir.getAbsolutePath();
			String fileLocation = path.substring(0, path.length() - 1) + file.getOriginalFilename();

			/*
			 * ClassLoader classLoader = FileUploadController.class.getClassLoader(); String
			 * excelFilePath = file.getOriginalFilename(); FileInputStream inputStream = new
			 * FileInputStream(new File(classLoader.getResource(excelFilePath).getFile()));
			 */

			FileInputStream excelFile = new FileInputStream(new File(fileLocation));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();
			int count = 0;
			Inquiry inquiry;
			while (iterator.hasNext()) {
				count = count + 1;
				Row currentRow = iterator.next();

				if (count > 3) {
					inquiry = ExelToBussinessObjectMapping.mapInquiry(currentRow);
					inquiryService.saveInquiryDetials(inquiry);
				}

				// Iterator<Cell> cellIterator = currentRow.iterator();

				/*
				 * while (cellIterator.hasNext()) { Cell currentCell = cellIterator.next(); if
				 * (currentCell.getCellTypeEnum() == CellType.STRING) {
				 * System.out.print(currentCell.getStringCellValue() + "--"); } else if
				 * (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
				 * 
				 * System.out.print(currentCell.getNumericCellValue() + "--"); }
				 * 
				 * }
				 */
				System.out.println();

			}
		} else {
			return new ResponseEntity<>("Invalid file.", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("File Uploaded Successfully.", HttpStatus.OK);

	}
}
