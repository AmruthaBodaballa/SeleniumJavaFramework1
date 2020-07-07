package Utilities;

public class ExcelUtiltiesDemo {

	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		ExcelUtilities  excel = new ExcelUtilities(projectpath+"\\excel new\\data.xlsx.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}
}
