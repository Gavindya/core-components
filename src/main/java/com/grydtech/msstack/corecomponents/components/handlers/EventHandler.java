package com.grydtech.msstack.corecomponents.components.handlers;

import com.grydtech.msstack.corecomponents.components.Event;

public interface EventHandler<T extends Event> {
    void handle(T event);
}
