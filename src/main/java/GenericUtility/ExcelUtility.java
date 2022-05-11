package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static String fetch(String Sheet, int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(constantPath.EXCEL_PATH);
		  Workbook wb= WorkbookFactory.create(fis);
	String value = wb.getSheet(Sheet).getRow(rowNum).getCell(colNum).getStringCellValue();
	return value;

	}
	
	}

