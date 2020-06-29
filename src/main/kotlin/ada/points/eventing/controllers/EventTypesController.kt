package ada.points.eventing.controllers

import org.springframework.beans.factory.annotation.Autowired
import ada.points.eventing.services.EventTypesService
import ada.points.eventing.repositories.EventTypesRepository
import ada.points.eventing.entity.EventTypes
import org.jooq.DSLContext
import org.jooq.impl.DefaultDSLContext
import org.springframework.transaction.support.TransactionTemplate
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/event_types")
class EventTypesController(private val eventTypesService: EventTypesService) {

    @GetMapping(value = ["/list"], produces = ["application/json"])
    @ResponseBody
    fun getEventTypes(): List<EventTypes> {
        return this.eventTypesService.getAllEventTypes()
    }

    @GetMapping("/greet")

    fun greet(@RequestParam("name") name: String): String {

        return "Hello, $name!"

    }
}