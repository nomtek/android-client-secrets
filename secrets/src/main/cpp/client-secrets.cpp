#ifndef SECRET_KEYS
#define SECRET_KEYS

#include <jni.h>
#include <map>
#include "secret-type.cpp"

std::map<int, const char *> secrets;

JNIEXPORT jint JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv *env;
    if (vm->GetEnv(reinterpret_cast<void **>(&env), JNI_VERSION_1_6) != JNI_OK) {
        return JNI_ERR;
    }

    secrets = {
            {SecretType::SAMPLE_SECRET,        "TestSecret Value"},
            {SecretType::SECOND_SAMPLE_SECRET, "TestSecret2 Value"}
    };

    return JNI_VERSION_1_6;
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_nomtek_secrets_ClientSecrets_getSecret(
        JNIEnv *pEnv,
        jobject pThis,
        jint secretType) {

    const char *key = secrets[secretType];
    return pEnv->NewStringUTF(key);
}

#endif
