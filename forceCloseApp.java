/**
 * Force close an application by its package name, requires ROOT
 * @param app The package name of the app you want to close
 */
public static void forceCloseApp(String app){
	try{
		Process suProcess = Runtime.getRuntime().exec("su");			
		DataOutputStream os = new DataOutputStream(suProcess.getOutputStream());
		os.writeBytes("adb shell" + "\n");
		os.flush();
		os.writeBytes("am force-stop " + app + "\n");
		os.flush();
		os.close();
	}catch(IOException e){}
}