package ca.cegepthetford.prepc19

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.room.Room
import ca.cegepthetford.prepc19.ui.theme.PrepC19Theme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrepC19Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val bd = Room.databaseBuilder(
                        applicationContext,
                        BDCours::class.java, "Cours420"
                    )
                        //.allowMainThreadQueries()
                        .build()
                    Demo(bd)
                }
            }
        }
    }
}

@Composable
fun Demo(bd: BDCours) {
    val porteeCoroutine: CoroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours

                daoCours.ajouterProf(Prof(31445, "Guay", "Marco"))

                daoCours.ajouterCours(Cours("109-103-MQ", "Activité physique autonome", 1,1,1,4))
                daoCours.ajouterCours(Cours("109-102-MQ", "Activité physique et efficacité", 0,2,1,3))
                daoCours.ajouterCours(Cours("109-101-MQ", "Activité physique et santé", 1,1,1, 2))
                daoCours.ajouterCours(Cours("420-3D5-RA", "Administration et maintenance d'ordinateurs", 2,3,2,2))
                daoCours.ajouterCours(Cours("604-COM-R4", "Anglais commun", 2,1,3,1))
                daoCours.ajouterCours(Cours("604-PRO-R4", "Anglais propre", 2,1,3,5))
                daoCours.ajouterCours(Cours("420-3M5-RA", "Approfondissement en développement Web", 2,3,3,4))
                daoCours.ajouterCours(Cours("420-3P5-RA", "Architecture Web", 2,3,3,5))
                daoCours.ajouterCours(Cours("420-3G4-RA", "Bases de données avancées", 2,2,2,3, 31445))
                daoCours.ajouterCours(Cours("420-2X3-RA", "Carrières informatiques", 1,2,1,1))
                daoCours.ajouterCours(Cours("350-253-RA", "Communication et contexte professionnel", 1,2,1,4))
                daoCours.ajouterCours(Cours("420-3J6-RA", "Composants et nouvelles technologies", 2,4,3,4))
                daoCours.ajouterCours(Cours("COM-001", "Cours complémentaire", 1,2,3,4))
                daoCours.ajouterCours(Cours("COM-002", "Cours complémentaire", 1,2,3,5))
                daoCours.ajouterCours(Cours("420-3Q5-RA", "Développement d'applications en intelligence d'affaires", 2,3,2,5, 31445))
                daoCours.ajouterCours(Cours("401-203-RA", "Droit, éthique et service à la clientèle", 1,2,1,3))
                daoCours.ajouterCours(Cours("601-101-MQ", "Écriture et littérature", 2,2,3,1))
                daoCours.ajouterCours(Cours("340-FAA-RA", "Éthique et politique", 2,1,3,4))
                daoCours.ajouterCours(Cours("420-2Y6-RA", "Installation d'ordinateurs", 2,4,3,1))
                daoCours.ajouterCours(Cours("420-3W5-RA", "Intégration Web", 2,3,2,6))
                daoCours.ajouterCours(Cours("420-2Z6-RA", "Introduction à la programmation", 3,3,3,1, 31445))
                daoCours.ajouterCours(Cours("420-3H6-RA", "Introduction à la programmation Web", 3,3,3,3))
                daoCours.ajouterCours(Cours("420-3C4-RA", "Introduction aux bases de données", 2,2,2,2))
                daoCours.ajouterCours(Cours("340-102-MQ", "L'être humain", 3,0,3,3))
                daoCours.ajouterCours(Cours("601-102-MQ", "Littérature et imaginaire", 3,1,3,2))
                daoCours.ajouterCours(Cours("601-103-MQ", "Littérature québécoise", 3,1,4,3))
                daoCours.ajouterCours(Cours("201-283-RA", "Mathématiques appliquées à l'informatique II", 2,1,1,2))
                daoCours.ajouterCours(Cours("420-3R3-RA", "Méthodologie de développement informatique", 1,2,1,5))
                daoCours.ajouterCours(Cours("201-273-RA", "Mathématiques appliquées à l'informatique I", 2,1,1,1))
                daoCours.ajouterCours(Cours("412-414-RA", "Outils de production bureautique", 2,2,2,2))
                daoCours.ajouterCours(Cours("340-101-MQ", "Philosophie et rationalité", 3,1,3,1))
                daoCours.ajouterCours(Cours("420-3N5-RA", "Programmation distribuée", 2,3,3,5))
                daoCours.ajouterCours(Cours("420-3L6-RA", "Programmation mainframe", 3,3,3,4))
                daoCours.ajouterCours(Cours("420-3V4-RA", "Programmation mobile", 2,2,2,6, 31445))
                daoCours.ajouterCours(Cours("420-3A4-RA", "Programmation orientée objet", 2,2,2,2))
                daoCours.ajouterCours(Cours("420-3E4-RA", "Programmation orientée objet avancée", 2,2,2,3))
                daoCours.ajouterCours(Cours("601-FAA-MQ", "Production théâtrale", 2,2,2,5))
                daoCours.ajouterCours(Cours("420-3U8-RA", "Projet de fin d'études", 1,7,2,6))
                daoCours.ajouterCours(Cours("420-3B5-RA", "Réseaux locaux et équipements", 2,3,2,2))
                daoCours.ajouterCours(Cours("420-3F5-RA", "Sécurité informatique", 2,3,2,3))
                daoCours.ajouterCours(Cours("420-3S4-RA", "Serveurs d'entreprise I", 2,2,3,5))
                daoCours.ajouterCours(Cours("420-3T5-RA", "Serveurs d'entreprise II", 2,3,2,6, 31445))
                daoCours.ajouterCours(Cours("420-3K5-RA", "Soutien informatique", 2,3,2,4))

                Log.d(
                    "ROOM",
                    "Peuplement terminé."
                )
            }
        }) {
            Text("Peupler")
        }
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours
                val cours = daoCours.chargerCours("420-3V4-RA")
                try {
                    daoCours.supprimerCours(cours)
                    Log.d(
                        "ROOM",
                        "Suppression 3V4"
                    )
                } catch (exception: Exception) {
                    Log.d(
                        "ROOM",
                        "Erreur: Suppression 3V4"
                    )
                }
            }
        }) {
            Text("Supprimer 420-3V4-RA")
        }
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours
                val cours = daoCours.chargerCours("420-3T5-RA")
                Log.d(
                    "ROOM",
                    cours.titre
                )
            }
        }) {
            Text("Charger cours 420-3T5-RA")
        }
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours
                val lesCours = daoCours.chargerCoursInformatique()
                lesCours.forEach { cours ->
                    Log.d(
                        "ROOM",
                        "${cours.noCours} -- ${cours.titre} -- session: ${cours.noSession}"
                    )
                }
            }
        }) {
            Text("Charger cours info")
        }
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours
                val lesCours = daoCours.chargerCoursOrdreNoSession()
                lesCours.forEach { cours ->
                    Log.d(
                        "ROOM",
                        "${cours.noCours} -- ${cours.titre} -- session: ${cours.noSession}"
                    )
                }
            }
        }) {
            Text("Charger cours ordre sessions")
        }
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours
                val lesCours = daoCours.chargerCoursOrdreNoSession()
                Log.d(
                    "ROOM",
                    "Nb de cours: ${daoCours.denombrerCours()}"
                )
            }
        }) {
            Text("Dénombrer les cours")
        }
        Button(onClick = {
            porteeCoroutine.launch {
                val daoCours = bd.daoCours
                val marco = daoCours.chargerCoursMarco()
                Log.d(
                    "ROOM",
                    "Prof: ${marco.prof.noEmpl} -- ${marco.prof.prenom} ${marco.prof.nom} "
                )
                Log.d(
                    "ROOM",
                    "Nb cours: ${marco.listeCours.count()}"
                )
                marco.listeCours.forEach() { unCours ->
                    Log.d(
                        "ROOM",
                        "  ${unCours.noCours} -- ${unCours.titre} -- session: ${unCours.noSession}"
                    )
                }
            }
        }) {
            Text("Cours de Marco")
        }
    }
}