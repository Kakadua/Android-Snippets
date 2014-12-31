 /**
 * Used to append text to a file
 * @param file The file you want to write to
 * @param text The text you want to append
 */
public void appendToFile(String file, String text){
	try {
		BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
		out.write(text);
		out.close();
	}catch(IOException e){}
}