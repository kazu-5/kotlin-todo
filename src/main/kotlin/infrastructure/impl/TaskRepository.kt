package infrastructure.impl

import domain.ITaskRepository
import domain.Task
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
class TaskRepository:ITaskRepository{
    override fun  save(task : Task):Task {
        return task
    }
}
