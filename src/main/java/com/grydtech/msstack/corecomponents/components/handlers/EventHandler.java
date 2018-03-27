package com.grydtech.msstack.corecomponents.components.handlers;

import com.grydtech.msstack.corecomponents.components.Event;

public interface EventHandler<EV extends Event> {
    void handle(EV event);
}
