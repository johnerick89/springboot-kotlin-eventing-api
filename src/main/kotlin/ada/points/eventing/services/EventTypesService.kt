package ada.points.eventing.services

import org.springframework.stereotype.Service
import ada.points.eventing.entity.EventTypes
import ada.points.eventing.repositories.EventTypesRepository


@Service
class EventTypesService (private val eventTypesRepository: EventTypesRepository)  {

    fun getAllEventTypes(): List<EventTypes> {
        return eventTypesRepository.findAll()
    }


}



