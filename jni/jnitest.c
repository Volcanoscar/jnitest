#include <jni.h>

jint Java_jni_Naitive_addValue(JNIEnv* env ,jobject thiz,jint value1, jint value2) {
	return value1 + value2;
}

jintArray Java_jni_Naitive_getArray(JNIEnv* env ,jobject thiz,jint size) {

	//　配列を新規作成する
	jintArray ary = (*env)->NewIntArray(env, size);

	//配列にデータを入れる
	jint fill[size];
	int i;
	for (i = 0; i < size; i++) {
		fill[i] = i;
	}
	(*env)->SetIntArrayRegion(env, ary, 0, size, fill);

	return ary;
}
