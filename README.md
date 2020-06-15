# Client secrets

Library for storing secrets in cpp layer.
Secrets stored directly in kotlin or java code or in resources can be easily extracted by reverse engineering.
To prevent this we should store secrets in c++ library using Android NDK.
This repository illustrates how to create such library and how to use it.

### Usage

To retrieve secret:
```
val secretValue = ClientSecrets.getSecret(SecretType.SAMPLE_SECRET)
```

To add a new secret:
1. Add a constant to com.nomtek.secrets.ClientSecrets
2. Add new enum value in secret-type.cpp
3. Add entry to a secrets map in client-secrets.cpp
```
secrets = {
          ...
          {SecretType::NEW_SECRET, "New Secret Value"}
};
```

Checkout "sample" module to see sample usage.

