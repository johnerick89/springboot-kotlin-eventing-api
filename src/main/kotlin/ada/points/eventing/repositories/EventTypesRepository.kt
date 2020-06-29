package ada.points.eventing.repositories

//import net.logstash.logback.argument.StructuredArguments.kv
import org.jooq.Record
import org.jooq.impl.DAOImpl
import org.jooq.impl.DefaultDSLContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Repository

import ada.points.eventing.entity.EventTypes
import ada.points.eventing.jooq.domain.Tables
import ada.points.eventing.jooq.domain.tables.records.EventTypesRecord


@Repository
class  EventTypesRepository (private val dsl: DefaultDSLContext) :
        DAOImpl<EventTypesRecord, EventTypes, String>(Tables.EVENT_TYPES, EventTypes::class.java, dsl.configuration()){
    override fun getId(p0: EventTypes?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val logger = LoggerFactory.getLogger(EventTypesRepository::class.java)

    /*fun findByName(name: String): EventTypes? {
        require(name.isNotEmpty()) { "[EventTypesRepository][findByName] Event Type name is empty." }
        val eventType = this.dsl
                .selectFrom(Tables.EVENT_TYPES)
                .where(Tables.EVENT_TYPES.name.equalIgnoreCase(name))
                .fetchOneInto(EventTypesRecord::class.java)?.map { record -> convertToEventType(record) }
        logger.info("Event Type retrieved {}. ", kv("event type", eventType.toString()))
        return eventType
    }

    fun save(eventType: EventTypes): EventTypes {
        if (this.exists(eventType)) {
            this.update(eventType)
        } else {
            this.insert(eventType)
        }
        val eventTypePersisted = this.findByName(eventType.name)
                ?: throw IllegalArgumentException("The save operation was not performed")
        logger.info("Country persisted {}", kv("country", eventType.toString()))
        return eventTypePersisted
    }

    override fun update(eventType: EventTypes) {
        logger.info("Event Type will be updated {}", kv("event Type", eventType.name))
        eventType.updateAuditableData()
        super.update(eventType)
    }

    override fun insert(eventType: EventTypes) {
        logger.info("New country {}", kv("country", eventType.name))
        super.insert(eventType)
    }*/

    override fun findAll(): List<EventTypes> {
        logger.info("Retrieve all Event types")
        return this.dsl
                .selectFrom(Tables.EVENT_TYPES)
                .fetchInto(EventTypesRecord::class.java)
                .map { countryRecord -> convertToEventType(countryRecord) }
    }

    /*override fun findById(id: Number): EventTypes? {
        require(id != null) { "[EventTypesRepository][findByName] Event Type id is empty." }
        val eventType = this.dsl
                .selectFrom(Tables.EVENT_TYPES)
                .where(Tables.EVENT_TYPES.ID.eq(id))
                .fetchOneInto(EventTypesRecord::class.java)?.map { record -> convertToEventType(record) }
        logger.info("Event Type retrieved {}. ", kv("event Type", eventType.toString()))
        return eventType
    }

    fun deleteById(id: Number): EventTypes {
        require(id != null) { "[EventTypesRepository][findByName] Event Type id is empty." }
        val eventType = this.findById(id) ?: throw IllegalArgumentException("The event type does not exist.")
        logger.info("Event Type will be deleted {}", kv("id", id))
        this.dsl
                .deleteFrom(Tables.EVENT_TYPES)
                .where(Tables.EVENT_TYPES.ID.eq(id))
                .execute()
        return eventType
    }*/

    private fun convertToEventType(record: Record): EventTypes {
        val eventTypesRecord = record as EventTypesRecord
        return EventTypes(eventTypesRecord.name,  eventTypesRecord.id)
    }
}