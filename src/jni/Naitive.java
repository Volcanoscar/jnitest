package jni;

public class Naitive {

	static {
		System.loadLibrary("jnitest");
	}
	
	public static native int addValue(int value1, int value2);
	
	public static native int[] getArray(int size); 
}
