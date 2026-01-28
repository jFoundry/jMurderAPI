package me.sevend;

/**
 * Thrown when the JMurder API is accessed before the plugin is loaded.
 */
public class IllegalPluginAccessException extends RuntimeException {

    public IllegalPluginAccessException(String message) {
        super(message);
    }
}
