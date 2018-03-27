package com.grydtech.msstack.corecomponents.components.handlers;

import com.grydtech.msstack.corecomponents.components.Request;

public interface QueryHandler<RQ extends Request, RS> {
    RS handle(RQ request);
}
