package com.act.jc.mgmt.exception;

/**
 * Thrown when some not well classified failure happens.
 *
 * @author agazzarini
 * @since 1.0
 */
public class SystemInternalException extends RuntimeException {
    /**
     * Builds a new {@link SystemInternalException} with the given cause.
     *
     * @param exception the exception cause.
     */
    public SystemInternalException(Exception exception) {
        super(exception);
    }
}
