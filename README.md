# Certificate of Residence

[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-brightgreen.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
[![Kotlin](https://img.shields.io/badge/kotlin-multiplatform--mobile-orange.svg?logo=kotlin)](http://kotlinlang.org)
[![Kotlin](https://img.shields.io/badge/kotlin-2.0.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
![Java](https://img.shields.io/badge/java-17-blue.svg?logo=OPENJDK)
[![Maven Central](https://img.shields.io/maven-central/v/at.asitplus.wallet/certificateofresidence)](https://mvnrepository.com/artifact/at.asitplus.wallet/certificateofresidence/)

Data classes representing certificate of residences, as a SD JWT Credential, with the help
of [KMM VC Lib](https://github.com/a-sit-plus/kmm-vc-library).

Be sure to call `at.asitplus.wallet.cor.Initializer.initWithVcLib` first thing in your application.

## Changelog

Release 1.0.0:

- Initial release, based on the Certificate of Residence Rulebook 0.1.0 from June 2024
