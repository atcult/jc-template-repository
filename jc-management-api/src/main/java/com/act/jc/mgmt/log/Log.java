package com.act.jc.mgmt.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Module logger.
 *
 */
public class Log {
    private final Logger logger;

    /**
     * Builds a new {@link Log} for the given owner class.
     *
     * @param owner the log instance owner.
     */
    public Log(final Class owner) {
        logger = LoggerFactory.getLogger(owner);
    }

    /**
     * Logs out a message with INFO priority level.
     *
     * @param message the log message.
     * @param values values that will be replaced in the message placeholders.
     */
    public void info(final String message, final Object... values) {
        logger.info(String.format(message, values));
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param exception the exception cause.
     */
    public void error(final Exception exception) {
        logger.error("", exception);
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param message
     *            the log message.
     */
    public void error(final String message) {
        logger.error(message);
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param message the log message.
     * @param values values that will be replaced in the message placeholders.
     */
    public void error(final String message, final Object... values) {
        logger.error(String.format(message, values));
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param message the log message.
     * @param throwable the exception cause.
     * @param values values that will be replaced in the message placeholders.
     */
    public void error(final String message, final Throwable throwable, final Object... values) {
        logger.error(String.format(message, values), throwable);
    }

    /**
     * Logs out a message with WARNING priority level.
     *
     * @param message the log message.
     * @param values values that will be replaced in the message placeholders.
     */
    public void warning(final String message, final Object... values) {
        logger.warn(String.format(message, values));
    }

    /**
     * Returns true if the decoratee logger is debug enabled.
     *
     * @return true if the decoratee logger is debug enabled.
     */
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param message the log message.
     */
    public void debug(final String message) {
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param message the log message.
     * @param values values that will be replaced in the message placeholders.
     */
    public void debug(final String message, Object... values) {
        if (logger.isDebugEnabled()) {
            logger.debug(String.format(message, values));
        }
    }

    /**
     * Logs out a message with ERROR priority level.
     *
     * @param message the log message.
     * @param value the value that will be replaced in the message placeholder.
     */
    public void debug(final String message, final String value) {
        if (logger.isDebugEnabled()) {
            logger.debug(String.format(message, value));
        }
    }

    public Logger getLogger() {
        return logger;
    }
}
