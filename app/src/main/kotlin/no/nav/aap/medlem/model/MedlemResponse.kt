package no.nav.aap.medlem.model

import java.util.*

enum class Svar { JA, NEI, UAVKLART }

data class MedlemResponse(
    val id: UUID,
    val personident: String,
    val erMedlem: Svar
)
