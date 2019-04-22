package domain

import javax.persistence.*

//@Entity
//data class Task(
//        val firstName: String,
//        val lastName: String,
//        @Id @GeneratedValue
//        val id: Long = -1)

//@Table(name="TASK")
//class Task(
//        @EmbeddedId
//        @AttributeOverride(name = "value", column = Column(name = "cart_id"))
//        val cartId: CartId
//){
//
////}
//
//@Entity
//@Table(name="TASK")
//class Task(bar: String, baz: String)
//{
////    @Id
//    @GeneratedValue
//    val id
//    val hoge = bar
//    val piyo = baz
////    @Id
////    var id:Long
//
////    @Id
////    @GeneratedValue
////    var id:Long
////
////    var name: String
////    constructor(name:String){
////        this.id
////        this.name = name
////    }
//}

@Entity
data class Task(
        @Id @GeneratedValue
        val id:Long,
        val name: String)

//{
//    @EmbeddedId
//    @AttributeOverride(name = "value", column = Column(name = "task_id"))
//    var id:Long

//    init(name:String) {
//        this.name = name
//    }
//}
