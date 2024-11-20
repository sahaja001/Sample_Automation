package sampleProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampler {
	public static void main(String arg[]) throws IOException {
		
		File file = new File("C:\\Users\\Admin\\Downloads\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1"); 
		
//		XSSFCell row = sh.getRow(1).getCell(1);
//		System.out.println(row);
//		
	int rowcount = sheet.getLastRowNum();
	
	for(int i =0;i<=rowcount;i++)
	{
		int cellcount = sheet.getRow(i).getLastCellNum();
		System.out.println("cell count is :" +cellcount);
		for(int j =0;j<=cellcount-1;j++)
		{
			String value = sheet.getRow(i).getCell(j).getStringCellValue();
			
			System.out.println( " row data " + i + " cell value is " +j +"value is " +value);
		}
	}

			
	}
}