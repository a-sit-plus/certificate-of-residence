package at.asitplus.wallet.cor


object CertificateOfResidenceDataElements {

    /** Current last name(s) or surname(s) of the User. */
    const val FAMILY_NAME = "family_name"

    /** Current first name(s), including middle name(s), of the User. */
    const val GIVEN_NAME = "given_name"

    /** Day, month, and year on which the User was born. If unknown, approximate date of birth. */
    const val BIRTH_DATE = "birth_date"

    /** The address of residence of the User. */
    const val RESIDENCE_ADDRESS = "residence_address"

    /** User’s gender, using a value as defined in ISO/IEC 5218. */
    const val GENDER = "gender"

    /** The place of the PID User’s birth */
    const val BIRTH_PLACE = "birth_place"

    /** Day, month, and year on which the PID User arrived at the address. */
    const val ARRIVAL_DATE = "arrival_date"

    /** Nationality of the User, as an Alpha-2 country code as specified in ISO 3166-1. */
    const val NATIONALITY = "nationality"

    /** Date and time when the CoR attestation was issued. */
    const val ISSUANCE_DATE = "issuance_date"

    /** Date and time when the CoR attestation will expire. */
    const val EXPIRY_DATE = "expiry_date"

    /** Name of the administrative authority that has issued this CoR attestation, or the ISO 3166 Alpha-2 country code
     *  of the respective Member State if there is no separate authority authorized to issue CoR attestations. */
    const val ISSUING_AUTHORITY = "issuing_authority"

    /** A number for the CoR attestation, assigned by the Provider. */
    const val DOCUMENT_NUMBER = "document_number"

    /** A number assigned by the CoR attestation Provider for audit control or other purposes. */
    const val ADMINISTRATIVE_NUMBER = "administrative_number"

    /** Alpha-2 country code, as defined in ISO 3166-1, of the CoR attestation Provider’s country or territory. */
    const val ISSUING_COUNTRY = "issuing_country"

    /** Country subdivision code of the jurisdiction that issued the CoR attestation, as defined in ISO 3166-2:2020,
     *  Clause 8. The first part of the code SHALL be the same as the value for issuing_country. */
    const val ISSUING_JURISDICTION = "issuing_jurisdiction"

    object Address {
        /** A location designator for a postal delivery point at a post office, usually a number (ex: “9383”). */
        const val PO_BOX = "po_box"

        /** The name of a passage or way through from one location to another. A thoroughfare is usually a street. */
        const val THOROUGHFARE = "thoroughfare"

        /** Number or sequence of characters that uniquely identifies the locator within the relevant scope
         * (building number, apartment number, etc). For an address such as "Flat 3, 17 Bridge Street",
         * the locator is "flat 3, 17". */
        const val LOCATOR_DESIGNATOR = "locator_designator"

        /** Proper noun(s) applied to the real world entity identified by the locator (ex: name of the property
         * or complex). */
        const val LOCATOR_NAME = "locator_name"

        /** Code created and maintained for postal purposes to identify a subdivision of addresses and postal
         *  delivery points (ex: “7500”). */
        const val POST_CODE = "post_code"

        /** Name created and maintained for postal purposes to identify a subdivision of addresses and postal delivery
         * points (ex: “Paris”). */
        const val POST_NAME = "post_name"

        /** Name of the uppermost level of the address. Almost always this is a country, which then must be the
         * Aplha-2 country code as specified in ISO 3166-1. */
        const val ADMIN_UNIT_L_1 = "admin_unit_L1"

        /** Name of a secondary level/region of the address. This is usually a county, state, region, province or
         * other such area that typically encompasses several localities */
        const val ADMIN_UNIT_L_2 = "admin_unit_L2"

        /** Complete address written as a string */
        const val FULL_ADDRESS = "full_address"

        val ALL_ELEMENTS = listOf(
            PO_BOX,
            THOROUGHFARE,
            LOCATOR_DESIGNATOR,
            LOCATOR_NAME,
            POST_CODE,
            POST_NAME,
            ADMIN_UNIT_L_1,
            ADMIN_UNIT_L_2,
            FULL_ADDRESS,
        )
    }

    val MANDATORY_ELEMENTS = listOf(
        FAMILY_NAME,
        GIVEN_NAME,
        BIRTH_DATE,
        RESIDENCE_ADDRESS,
        ISSUANCE_DATE,
        EXPIRY_DATE,
        ISSUING_AUTHORITY,
        ISSUING_COUNTRY,
    )

    val ALL_ELEMENTS = listOf(
        FAMILY_NAME,
        GIVEN_NAME,
        BIRTH_DATE,
        RESIDENCE_ADDRESS,
        GENDER,
        BIRTH_PLACE,
        ARRIVAL_DATE,
        NATIONALITY,
        ISSUANCE_DATE,
        EXPIRY_DATE,
        ISSUING_AUTHORITY,
        DOCUMENT_NUMBER,
        ADMINISTRATIVE_NUMBER,
        ISSUING_COUNTRY,
        ISSUING_JURISDICTION,
    )

}
