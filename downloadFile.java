 /**
 * Used to download a file from a URL
 * @param link URL to the file you want to save
 * @param directory The directory where you want to save the file
 * @param name The name you want your file to have
 */
public static void downloadFile(String link, File directory, String name) {
	int fileLength, counter, progress, progressTemp;
	long totalLength = 0;
	counter = progress = 0;
	try {
		URL url = new URL(link);
		URLConnection connection = url.openConnection();
		connection.connect();
		fileLength = connection.getContentLength();
		InputStream is = url.openStream();
		if(!directory.exists()){ directory.mkdir(); }
		FileOutputStream fos = new FileOutputStream(directory + name);
		byte data[] = new byte[1024];
		while((counter = is.read(data)) != -1){
			totalLength += counter;
			progressTemp = (int) totalLength * 100 / fileLength;
			if(progressTemp % 10 == 0 && progress != progressTemp){
				progress = progressTemp;
			}
			fos.write(data, 0, counter);
		}
		is.close();
		fos.close();
	}catch(Exception e){ }
}