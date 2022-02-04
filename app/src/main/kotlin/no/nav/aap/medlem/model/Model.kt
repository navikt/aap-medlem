package no.nav.aap.medlem.model

import java.time.LocalDate
import java.util.*

data class LovMe(
    val id: UUID,
    val folkeregisteridentifikator: String,
    val request: MedlemRequest?,
    val response: MedlemResponse?,
)

data class MedlemRequest(
    val førsteDagForYtelse: LocalDate = LocalDate.now(),
    val ytelse: String = "AAP",
    val oppholdUtenforNorgeSiste6år: Boolean = false,
)

enum class Svar { JA, NEI, UAVKLART }

data class MedlemResponse(
    val erMedlem: Svar
)
