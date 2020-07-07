package Utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password) {
		System.out.println(username+"  | "+password);
		
	}
	


	/*public static void main(String[] args) {
		String excelPath = "C:\\Users\\Amrutha\\Desktop\\MyWorkSpace\\SeleniumFrameWork\\excel new\\data.xlsx.xlsx";
		testData(excelPath, "Sheet1");
	}*/
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\Amrutha\\Desktop\\MyWorkSpace\\SeleniumFrameWork\\excel new\\data.xlsx.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}

	public Object[][] testData(String excelPath, String sheetName) {

		ExcelUtilities excel = new ExcelUtilities(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=0; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				//System.out.println(cellData+ " | ");
				data[i-1][j] = cellData;
			}
			System.out.println();

		}
		return data;

	}
}