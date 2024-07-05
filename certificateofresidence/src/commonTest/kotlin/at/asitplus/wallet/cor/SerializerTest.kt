package at.asitplus.wallet.cor

import at.asitplus.wallet.lib.data.jsonSerializer
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.encodeToString
import kotlin.random.Random

class SerializerTest : FunSpec({

    test("serialize credential") {
        val credential = CertificateOfResidence(
            familyName = randomString(),
            givenName = randomString(),
            birthDate = randomInstant(),
            residenceAddress = ResidenceAddress(
                poBox = randomString(),
                thoroughfare = randomString(),
                locatorDesignator = randomString(),
                locatorName = randomString(),
                postCode = randomString(),
                postName = randomString(),
                adminUnitLevel1 = randomString(),
                adminUnitLevel2 = randomString(),
                fullAddress = randomString(),
            ),
            gender = IsoSexEnum.NOT_APPLICABLE,
            birthPlace = randomString(),
            arrivalDate = randomInstant(),
            nationality = randomString(),
            issuanceDate = randomInstant(),
            expiryDate = randomInstant(),
            issuingAuthority = randomString(),
            documentNumber = randomString(),
            administrativeNumber = randomString(),
            issuingCountry = randomString(),
            issuingJurisdiction = randomString(),
        )
        val serialized = jsonSerializer.encodeToString(credential)
            .also { println(it) }

        val parsed: CertificateOfResidence = jsonSerializer.decodeFromString(serialized)

        parsed shouldBe credential
    }

})

private fun randomDate() = LocalDate.fromEpochDays(Random.nextInt(0, 1024))

private fun randomInstant() = Instant.fromEpochSeconds(Random.nextLong(0, 1024 * 1024 * 1024))


val charPool = ('A'..'Z') + ('a'..'z') + ('0'..'9')

fun randomString() = (1..16)
    .map { Random.nextInt(0, charPool.size).let { charPool[it] } }
    .joinToString("")
