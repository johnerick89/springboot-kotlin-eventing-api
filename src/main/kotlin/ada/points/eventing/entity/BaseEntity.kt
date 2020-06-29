package ada.points.eventing.entity

import java.io.Serializable
import java.time.Clock
import javax.persistence.*

open class BaseEntity : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    lateinit var id : Number
}