package com.nomtek.secrets

object ClientSecrets {
    init {
        System.loadLibrary("client-secrets")
    }

    external fun getSecret(@SecretType secretType: Int): String
}
