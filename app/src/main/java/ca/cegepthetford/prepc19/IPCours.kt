package ca.cegepthetford.prepc19

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert

@Dao
interface IPCours {
    // suspend: s'executent dans une coroutine

    @Upsert
    suspend fun ajouterProf(prof:Prof)

    @Upsert
    suspend fun ajouterCours(cours:Cours)
    //fun ajouterCours(cours:Cours)

    @Delete
    suspend fun supprimerCours(cours:Cours)
    //fun supprimerCours(cours:Cours)

    @Query("SELECT * FROM cours ORDER BY noSession ASC")
    suspend fun chargerCoursOrdreNoSession() : List<Cours>
    //fun chargerCoursOrdreNoSession() : List<Cours>

    @Query("SELECT * FROM cours WHERE noCours LIKE '420%'")
    suspend fun chargerCoursInformatique() : List<Cours>
    //fun chargerCoursInformatique() : List<Cours>

    @Query("SELECT * FROM cours WHERE noCours = :noCours")
    suspend fun chargerCours(noCours: String) : Cours
    //fun chargerCours(noCours: String) : Cours

    @Query("SELECT COUNT(*) as nbCours FROM COURS")
    suspend fun denombrerCours() : Int

    @Query("DELETE FROM cours WHERE noCours LIKE '340%'")
    suspend fun supprimerCoursPhilo()

    @Transaction
    @Query("SELECT * FROM prof where noEmpl = 31445")
    suspend fun chargerCoursMarco() : ProfAvecCours
}
