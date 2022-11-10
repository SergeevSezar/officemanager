package rome.sezarion.officemanager.database

import androidx.room.Dao
import androidx.room.Query
import rome.sezarion.officemanager.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime
}