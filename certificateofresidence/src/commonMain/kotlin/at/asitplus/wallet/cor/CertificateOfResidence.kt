package at.asitplus.wallet.cor

import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.ADMINISTRATIVE_NUMBER
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.ARRIVAL_DATE
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.BIRTH_DATE
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.BIRTH_PLACE
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.DOCUMENT_NUMBER
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.EXPIRY_DATE
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.FAMILY_NAME
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.GENDER
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.GIVEN_NAME
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.ISSUANCE_DATE
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.ISSUING_AUTHORITY
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.ISSUING_COUNTRY
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.ISSUING_JURISDICTION
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.NATIONALITY
import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.RESIDENCE_ADDRESS
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CertificateOfResidence(

    @SerialName(FAMILY_NAME)
    val familyName: String,

    @SerialName(GIVEN_NAME)
    val givenName: String,

    @SerialName(BIRTH_DATE)
    val birthDate: Instant,

    @SerialName(RESIDENCE_ADDRESS)
    val residenceAddress: ResidenceAddress,

    @SerialName(GENDER)
    @Serializable(with = IsoSexEnumSerializer::class)
    val gender: IsoSexEnum? = null,

    @SerialName(BIRTH_PLACE)
    val birthPlace: String? = null,

    @SerialName(ARRIVAL_DATE)
    val arrivalDate: Instant? = null,

    @SerialName(NATIONALITY)
    val nationality: String? = null,

    @SerialName(ISSUANCE_DATE)
    val issuanceDate: Instant,

    @SerialName(EXPIRY_DATE)
    val expiryDate: Instant,

    @SerialName(ISSUING_AUTHORITY)
    val issuingAuthority: String,

    @SerialName(DOCUMENT_NUMBER)
    val documentNumber: String? = null,

    @SerialName(ADMINISTRATIVE_NUMBER)
    val administrativeNumber: String? = null,

    @SerialName(ISSUING_COUNTRY)
    val issuingCountry: String,

    @SerialName(ISSUING_JURISDICTION)
    val issuingJurisdiction: String? = null,
)

