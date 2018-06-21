package com.datas;

import java.io.File;

public class PathProvider {
	private final String userDir = System.getProperty("user.dir");
	File file = new File(userDir);
	public String getFilePath(String fileName) {
		String path = userDir + File.separator;
		return path;
	}
	
	public String getConfigPath(String fileName) {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "java" 
					+ File.separator + "com" + File.separator + "configs" 
					+ File.separator + fileName;
		return path;
	}
	
	public String getWebDriverPath(String driverName) {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "Drivers"
				+ File.separator + driverName;
		return path;
	}
	//=========== get Driver path =============
	public String getDriverChromePath() {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "Drivers"
				+ File.separator + "chromedriver.exe";
		return path;
	}
	
	public String getDriverGeckoPath() {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "Drivers"
				+ File.separator + "geckodriver.exe";
		return path;
	}
	
	public String getDriverOperaPath() {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "Drivers"
				+ File.separator + "operadriver.exe";
		return path;
	}
	public String getDriverIEPath() {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "Drivers"
				+ File.separator + "IEDriverServer.exe";
		return path;
	}
	public String getDriverEdgePath() {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "Drivers"
				+ File.separator + "MicrosoftWebDriver.exe";
		return path;
	}
	//excel
	public String getDataTestPath(String fileName) {
		String path = userDir + File.separator + "src" + File.separator + "test" + File.separator + "resources" 
				+ File.separator + "DataExcels"
				+ File.separator + fileName;
		return path;
	}

}
