# Hyperion

## Java Encryption library

### Packages

* dev.zihasz.hyperion.base - Interfaces for making custom encodings/encryption/hashes
* dev.zihasz.hyperion.encoding - All encoding formats included by default
* dev.zihasz.hyperion.encryption - All encryption methods included by default
* dev.zihasz.hyperion.hash - All hashing functions in included by default
* dev.zihasz.hyperion.util - Utilities for both internal and external uses
* dev.zihasz.hyperion.wrapper - Wrappers for `MessageDigest`

### Using

#### Gradle

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.zihasz:Hyperion:1.0'
}
```

## Contributing

1. Clone the repo using`git clone https://github.com/ZihaszDevelopment/Hyperion.git`
2. Make changes
3. Create a fork on github
4. Push changes to your fork
5. Create a pull request across forks