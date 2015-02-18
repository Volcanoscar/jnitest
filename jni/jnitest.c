#include <jni.h>

jint Java_jni_Naitive_addValue(JNIEnv* env ,jobject thiz,jint value1, jint value2) {
	return value1 + value2;
}
