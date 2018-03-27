package com.grydtech.msstack.corecomponents.components.handlers;

import com.grydtech.msstack.corecomponents.components.Request;
import com.grydtech.msstack.corecomponents.components.Response;

public interface CommandHandler<RQ extends Request, RS extends Response> {
    RS handle(RQ request);
}
