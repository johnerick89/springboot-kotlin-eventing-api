/*
 * This file is generated by jOOQ.
 */
package ada.points.eventing.jooq.domain.tables.records;


import ada.points.eventing.jooq.domain.tables.Events;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsRecord extends UpdatableRecordImpl<EventsRecord> implements Record6<Integer, Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = -2020572928;

    /**
     * Setter for <code>test.EVENTS.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.EVENTS.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.EVENTS.EVENT_TYPE_ID</code>.
     */
    public void setEventTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.EVENTS.EVENT_TYPE_ID</code>.
     */
    public Integer getEventTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>test.EVENTS.CID</code>.
     */
    public void setCid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.EVENTS.CID</code>.
     */
    public String getCid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.EVENTS.UUID</code>.
     */
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.EVENTS.UUID</code>.
     */
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.EVENTS.PAYLOAD</code>.
     */
    public void setPayload(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.EVENTS.PAYLOAD</code>.
     */
    public String getPayload() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.EVENTS.ADDED_AT</code>.
     */
    public void setAddedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.EVENTS.ADDED_AT</code>.
     */
    public Timestamp getAddedAt() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Events.EVENTS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Events.EVENTS.EVENT_TYPE_ID;
    }

    @Override
    public Field<String> field3() {
        return Events.EVENTS.CID;
    }

    @Override
    public Field<String> field4() {
        return Events.EVENTS.UUID;
    }

    @Override
    public Field<String> field5() {
        return Events.EVENTS.PAYLOAD;
    }

    @Override
    public Field<Timestamp> field6() {
        return Events.EVENTS.ADDED_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getEventTypeId();
    }

    @Override
    public String component3() {
        return getCid();
    }

    @Override
    public String component4() {
        return getUuid();
    }

    @Override
    public String component5() {
        return getPayload();
    }

    @Override
    public Timestamp component6() {
        return getAddedAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getEventTypeId();
    }

    @Override
    public String value3() {
        return getCid();
    }

    @Override
    public String value4() {
        return getUuid();
    }

    @Override
    public String value5() {
        return getPayload();
    }

    @Override
    public Timestamp value6() {
        return getAddedAt();
    }

    @Override
    public EventsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public EventsRecord value2(Integer value) {
        setEventTypeId(value);
        return this;
    }

    @Override
    public EventsRecord value3(String value) {
        setCid(value);
        return this;
    }

    @Override
    public EventsRecord value4(String value) {
        setUuid(value);
        return this;
    }

    @Override
    public EventsRecord value5(String value) {
        setPayload(value);
        return this;
    }

    @Override
    public EventsRecord value6(Timestamp value) {
        setAddedAt(value);
        return this;
    }

    @Override
    public EventsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsRecord
     */
    public EventsRecord() {
        super(Events.EVENTS);
    }

    /**
     * Create a detached, initialised EventsRecord
     */
    public EventsRecord(Integer id, Integer eventTypeId, String cid, String uuid, String payload, Timestamp addedAt) {
        super(Events.EVENTS);

        set(0, id);
        set(1, eventTypeId);
        set(2, cid);
        set(3, uuid);
        set(4, payload);
        set(5, addedAt);
    }
}
