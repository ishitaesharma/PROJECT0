package in.co.rays.proj0.exception;

/**
 * ApplicationException is propagated from Service classes when an business
 * logic exception occurred.
 * 
 * @author ISHITA
 * 
 */

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
     * @param msg
     * Error message
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}