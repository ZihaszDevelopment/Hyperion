# Hyperion

## Java Cryptography library

### Packages

* dev.zihasz.hyperion.api - Interfaces and abstracts for making custom encodings/encryption/hashes
* dev.zihasz.hyperion.impl.encoding - All encoding formats included by default
* dev.zihasz.hyperion.impl.encryption - All encryption methods included by default
* dev.zihasz.hyperion.impl.hash - All hashing functions in included by default
* dev.zihasz.hyperion.impl.keys.exchange - Key exchange implementations (e.g. Diffie-Hellman)
* dev.zihasz.hyperion.impl.keys.stores - Key stores for storing keys safely
* dev.zihasz.hyperion.impl.keys.kek - Key encryption for securing your keys
* dev.zihasz.hyperion.impl.signal - Signal implementations
* dev.zihasz.hyperion.util - Utilities for both internal and external uses
* dev.zihasz.hyperion.impl.wrapper - Wrappers for `MessageDigest`

### Using

#### Gradle

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.zihasz:Hyperion:2.0'
}
```

## Contributing

1. Clone the repo using`git clone https://github.com/ZihaszDevelopment/Hyperion.git`
2. Make changes
3. Create a fork on github
4. Push changes to your fork
5. Create a pull request across forks