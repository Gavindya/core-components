package com.grydtech.msstack.corecomponents.components.handlers;

import com.grydtech.msstack.corecomponents.components.Request;

public interface QueryHandler<R extends Request, S> {
    S handle(R request);
}
