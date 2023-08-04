package dev.rubenichvitor.mygoals.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import dev.rubenichvitor.mygoals.database.model.ActivityType

@Dao
interface ActivityTypeDao {

    @Query("SELECT * From type")
    fun getAll(): List<ActivityType>

    @Insert
    fun insertActivityType(activityType: ActivityType)

    @Delete
    fun deleteActivityType(activityType: ActivityType)
}