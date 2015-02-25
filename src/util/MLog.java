package util;

import static android.util.Log.DEBUG;
import static android.util.Log.ERROR;
import static android.util.Log.INFO;
import static android.util.Log.VERBOSE;
import static android.util.Log.WARN;
import android.util.Log;

public final class MLog {

	private static final boolean log = true;

	public static final void v(String msg) {
		LOG(VERBOSE, msg);
	}

	public static final void d(String msg) {
		LOG(DEBUG, msg);
	}

	public static final void i(String msg) {
		LOG(INFO, msg);
	}

	public static final void w(String msg) {
		LOG(WARN, msg);
	}

	public static final void e(String msg) {
		LOG(ERROR, msg);
	}

	public static final void e(Throwable e) {
		LOG(ERROR, Log.getStackTraceString(e));
	}

	public static final void showMethodName() {
		final StackTraceElement element = Thread.currentThread().getStackTrace()[3];
		LOG(VERBOSE, element.getClassName() + "#" + element.getMethodName());
	}

	private static void LOG(int priority, String msg) {
		if (log)
			Log.println(priority, "TEST", msg);
	}

}
