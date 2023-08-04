package dev.rubenichvitor.mygoals.database.repository

import dev.rubenichvitor.mygoals.database.dao.ActivityTypeDao
import dev.rubenichvitor.mygoals.database.model.ActivityType

class ActivityTypeRepository(private val activityTypeDao: ActivityTypeDao) {

    fun insertActivityType(activityType: ActivityType){
        activityTypeDao.insertActivityType(activityType)
    }

    fun deleteActivityType(activityType: ActivityType){

    }
}