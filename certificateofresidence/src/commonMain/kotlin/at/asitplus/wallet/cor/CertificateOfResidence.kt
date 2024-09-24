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
import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CertificateOfResidence(

    /** Current last name(s) or surname(s) of the User. */
    @SerialName(FAMILY_NAME)
    val familyName: String,

    /** Current first name(s), including middle name(s), of the User. */
    @SerialName(GIVEN_NAME)
    val givenName: String,

    /** Day, month, and year on which the User was born. If unknown, approximate date of birth. */
    @SerialName(BIRTH_DATE)
    val birthDate: LocalDate,

    /** The address of residence of the User. */
    @SerialName(RESIDENCE_ADDRESS)
    val residenceAddress: ResidenceAddress,

    /** User’s gender, using a value as defined in ISO/IEC 5218. */
    @SerialName(GENDER)
    @Serializable(with = IsoSexEnumSerializer::class)
    val gender: IsoSexEnum? = null,

    /** The place of the PID User’s birth */
    @SerialName(BIRTH_PLACE)
    val birthPlace: String? = null,

    /** Day, month, and year on which the PID User arrived at the address. */
    @SerialName(ARRIVAL_DATE)
    val arrivalDate: LocalDate? = null,

    /** Nationality of the User, as an Alpha-2 country code as specified in ISO 3166-1. */
    @SerialName(NATIONALITY)
    val nationality: String? = null,

    /** Date and time when the CoR attestation was issued. */
    @SerialName(ISSUANCE_DATE)
    val issuanceDate: Instant,

    /** Date and time when the CoR attestation will expire. */
    @SerialName(EXPIRY_DATE)
    val expiryDate: Instant,

    /** Name of the administrative authority that has issued this CoR attestation, or the ISO 3166 Alpha-2 country code
     *  of the respective Member State if there is no separate authority authorized to issue CoR attestations. */
    @SerialName(ISSUING_AUTHORITY)
    val issuingAuthority: String,

    /** A number for the CoR attestation, assigned by the Provider. */
    @SerialName(DOCUMENT_NUMBER)
    val documentNumber: String? = null,

    /** A number assigned by the CoR attestation Provider for audit control or other purposes. */
    @SerialName(ADMINISTRATIVE_NUMBER)
    val administrativeNumber: String? = null,

    /** Alpha-2 country code, as defined in ISO 3166-1, of the CoR attestation Provider’s country or territory. */
    @SerialName(ISSUING_COUNTRY)
    val issuingCountry: String,

    /** Country subdivision code of the jurisdiction that issued the CoR attestation, as defined in ISO 3166-2:2020,
     *  Clause 8. The first part of the code SHALL be the same as the value for issuing_country. */
    @SerialName(ISSUING_JURISDICTION)
    val issuingJurisdiction: String? = null,
)

