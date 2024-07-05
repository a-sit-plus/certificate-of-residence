package at.asitplus.wallet.cor

import at.asitplus.wallet.cor.CertificateOfResidenceDataElements.Address
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResidenceAddress(
    @SerialName(Address.PO_BOX)
    val poBox: String? = null,

    @SerialName(Address.THOROUGHFARE)
    val thoroughfare: String? = null,

    @SerialName(Address.LOCATOR_DESIGNATOR)
    val locatorDesignator: String? = null,

    @SerialName(Address.LOCATOR_NAME)
    val locatorName: String? = null,

    @SerialName(Address.POST_CODE)
    val postCode: String? = null,

    @SerialName(Address.POST_NAME)
    val postName: String? = null,

    @SerialName(Address.ADMIN_UNIT_L_1)
    val adminUnitLevel1: String? = null,

    @SerialName(Address.ADMIN_UNIT_L_2)
    val adminUnitLevel2: String? = null,

    @SerialName(Address.FULL_ADDRESS)
    val fullAddress: String? = null,
)