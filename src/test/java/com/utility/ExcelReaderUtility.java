package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import com.ui.pojo.User;


public class ExcelReaderUtility {

	public static Iterator<User> readExcelFile(String fileName) {
		
		File xlsxFile = new File(System.getProperty("user.dir")+"//testData//loginData.xlsx");
		
		XSSFWorkbook xssfWorkbook = null;
		List<User> userList = null;
		Iterator<Row> rowIterator;
		XSSFSheet xssfSheet;
		Row row;
		Cell emailAddressCell;
		Cell passwordCell;
		User user;
		try {
			xssfWorkbook = new XSSFWorkbook(xlsxFile);
			userList = new ArrayList<User>();
			xssfSheet = xssfWorkbook.getSheet("LoginTestData");
			rowIterator = xssfSheet.iterator();
			rowIterator.next();
			while(rowIterator.hasNext()) {
				row = rowIterator.next();
				emailAddressCell = row.getCell(0);
				passwordCell = row.getCell(1);
				user = new User(emailAddressCell.toString(),passwordCell.toString());
				userList.add(user);
				xssfWorkbook.close();
			}
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return userList.iterator();
		
	}
}
