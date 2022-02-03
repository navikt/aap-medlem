package no.nav.aap

import java.time.LocalDate

data class Request(
    val personident: String,
    val førsteDagForYtelse: LocalDate, // virkedato, kravdato, mottattdato? hva trenger lovme den til?
    val ytelse: String = "AAP",
    val oppholdUtenforNorgeSiste6år: Boolean = false,
)

data class Response(
    val erMedlem: Svar,
)

enum class Svar {
    JA, NEI, UAVKLART
}
