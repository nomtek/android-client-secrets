package com.nomtek.secrets;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({
        SecretType.SAMPLE_SECRET,
        SecretType.SECOND_SAMPLE_SECRET
})

public @interface SecretType {
    int SAMPLE_SECRET = 21;
    int SECOND_SAMPLE_SECRET = 22;
}
