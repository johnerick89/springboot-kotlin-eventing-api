package ada.points.eventing.entity
import java.time.Clock
import javax.persistence.*

@Entity

@Table(name = "events")
data class Events  (

        var cid: String = "",

        var uuid: String = "",

        var payload: String = "",

        var event_type_id: Number,

        var added_at: Long = Clock.systemUTC().millis()
        )  : BaseEntity(){

        constructor(cid: String, uuid: String, payload : String, event_type_id: Number, added_at: Long, id : Number ) : this(cid, uuid, payload, event_type_id,added_at) {
                this.id = id
        }

}