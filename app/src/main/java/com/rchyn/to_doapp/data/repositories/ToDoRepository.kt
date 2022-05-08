package com.rchyn.to_doapp.data.repositories

import com.rchyn.to_doapp.data.ToDoDao
import com.rchyn.to_doapp.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(
    private val toDoDao: ToDoDao
) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()

    val sortyByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()

    val sortyByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask) {
        toDoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask) {
        toDoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask) {
        toDoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTasks() {
        toDoDao.deleteAllTasks()
    }

    fun searchTask(query: String): Flow<List<ToDoTask>> {
        return toDoDao.searchTask(query = query)
    }
}