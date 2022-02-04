package no.nav.aap.medlem.model

import java.time.LocalDate
import java.util.*

data class MedlemRequest(
    val personident: String,
    val førsteDagForYtelse: LocalDate = LocalDate.now(),
    val id: UUID = UUID.randomUUID(),
    val ytelse: String = "AAP",
    val oppholdUtenforNorgeSiste6år: Boolean = false,
)
