package ca.cegepthetford.prepc19

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Cours::class, Prof::class],
    version = 1
)
abstract class BDCours : RoomDatabase() {
    abstract val daoCours : IPCours
}