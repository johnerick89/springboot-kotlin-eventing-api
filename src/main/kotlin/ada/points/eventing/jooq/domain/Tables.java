/*
 * This file is generated by jOOQ.
 */
package ada.points.eventing.jooq.domain;


import ada.points.eventing.jooq.domain.tables.EventTypes;
import ada.points.eventing.jooq.domain.tables.Events;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>test.EVENTS</code>.
     */
    public static final Events EVENTS = Events.EVENTS;

    /**
     * The table <code>test.EVENT_TYPES</code>.
     */
    public static final EventTypes EVENT_TYPES = EventTypes.EVENT_TYPES;
}
