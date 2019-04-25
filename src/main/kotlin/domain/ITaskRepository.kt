package domain

import org.springframework.stereotype.Repository

interface ITaskRepository {
    fun save(task : Task):Task
}
