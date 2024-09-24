package at.asitplus.wallet.cor

import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.Address
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResidenceAddress(
    /** A location designator for a postal delivery point at a post office, usually a number (ex: “9383”). */
    @SerialName(Address.PO_BOX)
    val poBox: String? = null,

    /** The name of a passage or way through from one location to another. A thoroughfare is usually a street. */
    @SerialName(Address.THOROUGHFARE)
    val thoroughfare: String? = null,

    /** Number or sequence of characters that uniquely identifies the locator within the relevant scope
     * (building number, apartment number, etc). For an address such as "Flat 3, 17 Bridge Street",
     * the locator is "flat 3, 17". */
    @SerialName(Address.LOCATOR_DESIGNATOR)
    val locatorDesignator: String? = null,

    /** Proper noun(s) applied to the real world entity identified by the locator (ex: name of the property
     * or complex). */
    @SerialName(Address.LOCATOR_NAME)
    val locatorName: String? = null,

    /** Code created and maintained for postal purposes to identify a subdivision of addresses and postal
     *  delivery points (ex: “7500”). */
    @SerialName(Address.POST_CODE)
    val postCode: String? = null,

    /** Name created and maintained for postal purposes to identify a subdivision of addresses and postal delivery
     * points (ex: “Paris”). */
    @SerialName(Address.POST_NAME)
    val postName: String? = null,

    /** Name of the uppermost level of the address. Almost always this is a country, which then must be the
     * Aplha-2 country code as specified in ISO 3166-1. */
    @SerialName(Address.ADMIN_UNIT_L_1)
    val adminUnitLevel1: String? = null,

    /** Name of a secondary level/region of the address. This is usually a county, state, region, province or
     * other such area that typically encompasses several localities */
    @SerialName(Address.ADMIN_UNIT_L_2)
    val adminUnitLevel2: String? = null,

    /** Complete address written as a string */
    @SerialName(Address.FULL_ADDRESS)
    val fullAddress: String? = null,
)