package com.act.jc.mgmt.controllers;

import com.act.jc.mgmt.exception.SystemInternalException;
import com.act.jc.mgmt.log.Log;
import com.act.jc.mgmt.log.MessageCatalog;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

public abstract class BaseController {
    protected final Log logger = new Log(getClass());

    @ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Unauthenticated request")
    @ExceptionHandler(SecurityException.class)
    public void notAllowed(final SecurityException exception) {
        // Do nothing here
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Required resource cannot be found.")
    @ExceptionHandler(ResourceNotFoundException.class)
    public void badRequest(final ResourceNotFoundException exception) {
        // Do nothing here
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error occurred.")
    @ExceptionHandler({SystemInternalException.class, SQLException.class})
    public void internalFailure(final Exception exception) {
        logger.error(MessageCatalog._000024_SYSTEM_INTERNAL_FAILURE, exception);
    }
}
