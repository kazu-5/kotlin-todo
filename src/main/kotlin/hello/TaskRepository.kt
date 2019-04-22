package hello

import domain.Task
import org.springframework.data.repository.CrudRepository

interface TaskRepository : CrudRepository<Task, Long> {
//    fun findById(id: Long): Iterable<Task>
}
