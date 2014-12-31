/**
 * Convert an InputStream to a String
 * @param is The InputStream that you want to get as String
 * @return Your String
 */
static String convertStreamToString(InputStream is) {
	Scanner s = new Scanner(is).useDelimiter("\\A");
	if(s.hasNext()){
		return s.next();
	}else{
		return "";
	}
}