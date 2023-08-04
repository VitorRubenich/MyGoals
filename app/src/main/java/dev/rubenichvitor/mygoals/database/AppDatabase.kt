package dev.rubenichvitor.mygoals.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dev.rubenichvitor.mygoals.database.dao.ActivityTypeDao
import dev.rubenichvitor.mygoals.database.model.ActivityType

@Database(entities = [ActivityType::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun activityTypeDao(): ActivityTypeDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}