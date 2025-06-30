package at.asitplus.wallet.cor

import at.asitplus.wallet.lib.data.ConstantIndex.CredentialRepresentation
import at.asitplus.wallet.lib.data.ConstantIndex.CredentialRepresentation.SD_JWT
import at.asitplus.wallet.lib.data.ConstantIndex.CredentialScheme

object CertificateOfResidenceScheme : CredentialScheme {

    override val schemaUri: String = "https://wallet.a-sit.at/schemas/1.0.0/cor.json"
    override val sdJwtType: String = "eu.europa.ec.eudi.cor.1"
    override val supportedRepresentations: Collection<CredentialRepresentation> =
        listOf(SD_JWT)
    override val claimNames: Collection<String> = CertificateOfResidenceDataElements.ALL_ELEMENTS
}
