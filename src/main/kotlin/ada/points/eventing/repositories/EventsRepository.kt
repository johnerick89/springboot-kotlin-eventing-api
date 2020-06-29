package ada.points.eventing.repositories
import ada.points.eventing.entity.Events

interface EventsRepository {
    fun findByCid(cid: String): Events?
    fun findAllByOrderByAddedAtDesc(): Iterable<Events>
}