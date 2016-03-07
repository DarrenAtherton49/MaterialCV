package com.atherton.darren.exceptions;

/**
 * Base exception for the project. All runtime exceptions related to MVP
 * aspects of the project should extend this class.
 */
public class BaseMvpException extends RuntimeException {

    public BaseMvpException() {
        super();
    }

    public BaseMvpException(String detailMessage) {
        super(detailMessage);
    }
}
