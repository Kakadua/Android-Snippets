/**
 * Convert an InputStream to a String
 * Requires convertStreamToString
 * @param is The InputStream that you want to get as String
 * @return Your String
 */
public static String getStringFromFile(File file){
	try {
		FileInputStream fis = new FileInputStream(file);
		String returnString = convertStreamToString(fis);
		fis.close();
		return returnString;
	} catch (Exception e) {
		return "";
	}
}