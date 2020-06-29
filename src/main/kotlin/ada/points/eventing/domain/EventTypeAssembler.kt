package ada.points.eventing.domain

import ada.points.eventing.entity.EventTypes
import org.springframework.stereotype.Component

@Component
class EventTypeAssembler {
    fun convertToDomainObject(eventType: EventTypes): EventTypes {
        return EventTypes(eventType.name)
    }

    fun convertToDTO(eventType: EventTypes?): EventTypes {
        return if (eventType == null) EventTypes() else EventTypes(eventType.name)
    }
}