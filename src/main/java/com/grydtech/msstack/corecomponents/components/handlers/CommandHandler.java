package com.grydtech.msstack.corecomponents.components.handlers;

import com.grydtech.msstack.corecomponents.components.Request;
import com.grydtech.msstack.corecomponents.components.Response;

public interface CommandHandler<R extends Request, S extends Response> {
    S handle(R request);
}
