package hello

import domain.ITaskRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

	private val log = LoggerFactory.getLogger(Application::class.java)

//	@Autowired
//	lateinit var customerRepository: CustomerRepository
//
	@Autowired
	lateinit var taskRepository: ITaskRepository

	@Bean
	fun init() = CommandLineRunner {
//		customerRepository.save(Customer("Jack", "Bauer"))
//		customerRepository.save(Customer("Chloe", "O'Brian"))
//		customerRepository.save(Customer("Kim", "Bauer"))
//		customerRepository.save(Customer("David", "Palmer"))
//		customerRepository.save(Customer("Michelle", "Dessler"))
//
//		log.info("customers")
//		customerRepository.findAll().forEach(Consumer {log.info(it.toString()) })
//
//
//		taskRepository.save(Task(1, "taskName"))
//		log.info("tasks")
//		taskRepository.findAll().forEach { log.info(it.toString()) }


//			// fetch all customers
//			log.info("Customers found with findAll():")
//			log.info("-------------------------------")
//			customerRepository.findAll().forEach { log.info(it.toString()) }
//			log.info("")
//
//			// fetch an individual customer by ID
//			val customer = customerRepository.findById(1L)
//			customer.ifPresent {
//				log.info("Customer found with findById(1L):")
//				log.info("--------------------------------")
//				log.info(it.toString())
//				log.info("")
//			}

//			taskRepository.save(Task(1,"11"))
//
//			// fetch all customers
//			log.info("Tasks found with findAll():")
//			log.info("-------------------------------")
//			taskRepository.findAll().forEach { log.info(it.toString()) }
//			log.info("")
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):")
//			log.info("--------------------------------------------")
//			customerRepository.findByLastName("Bauer").forEach { log.info(it.toString()) }
//			log.info("")
	}

}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
