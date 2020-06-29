package ada.points.eventing.entity

import javax.persistence.*

@Entity

@Table(name = "event_types")
data class EventTypes(
       var name:String = ""
): BaseEntity(){

    constructor(name: String, id: Number) : this(name) {
        this.id = id
    }

}