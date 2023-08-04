package dev.rubenichvitor.mygoals.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "type")
data class ActivityType(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "activity_type")
    val activityType: String,

    val active: Boolean
)
