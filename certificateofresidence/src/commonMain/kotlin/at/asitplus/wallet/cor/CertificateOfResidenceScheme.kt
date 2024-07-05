package at.asitplus.wallet.cor

import at.asitplus.wallet.lib.data.ConstantIndex.CredentialRepresentation
import at.asitplus.wallet.lib.data.ConstantIndex.CredentialRepresentation.SD_JWT
import at.asitplus.wallet.lib.data.ConstantIndex.CredentialScheme
import at.asitplus.wallet.lib.data.SchemaIndex

object CertificateOfResidenceScheme : CredentialScheme {

    override val schemaUri: String = "${SchemaIndex.BASE}/schemas/1.0.0/cor.json"
    override val sdJwtType: String = "eu.europa.ec.eudi.cor.1"
    override val supportedRepresentations: Collection<CredentialRepresentation> =
        listOf(SD_JWT)
}
