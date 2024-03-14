package ca.cegepthetford.prepc19

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.time.LocalDateTime

@Entity
data class Cours(
    @PrimaryKey
    val noCours : String,
    val titre : String,
    val pondTheo : Int,
    val pondLabo : Int,
    val pondPerso : Int,
    val noSession : Int,
    val noEmpl : Int? = null
)

@Entity
data class Prof(
    @PrimaryKey
    val noEmpl : Int,
    val nom : String,
    val prenom : String
)

data class ProfAvecCours(
    @Embedded val prof : Prof,
    @Relation(
        parentColumn = "noEmpl",
        entityColumn = "noEmpl"
    )
    val listeCours : List<Cours>
)