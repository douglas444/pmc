package br.ufu.facom.apl.gui.exception;

public class ServiceException extends Exception {
    public ServiceException(String s) {
        super(s);
    }
    public ServiceException(String s, Throwable throwable) {
        super(s, throwable);
    }
}