package rome.sezarion.officemanager.database

import androidx.room.Database
import androidx.room.RoomDatabase
import rome.sezarion.officemanager.Crime

@Database(entities = [Crime::class], version = 1)
abstract class CrimeDatabase : RoomDatabase() {

}