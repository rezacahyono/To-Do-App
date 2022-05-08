package com.rchyn.to_doapp.data

import androidx.room.Database
import com.rchyn.to_doapp.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {
    abstract fun todoDao(): ToDoDao


}