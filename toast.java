 /**
 * Show a long toast
 * @param msg
 */
public void longToast(String msg){
	Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
	t.show();
}

 /**
 * Show a short toast
 * @param msg
 */
public void shortToast(String msg){
	Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
	t.show();
}