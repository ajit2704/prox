package jiaqiz.cmu.edu.foodeliver.utility;

/**
 * Transition interface.

 */
public interface Transition {

    /**
     * Transit to another activity.
     */
    void transit();

    /**
     * Show the toast.
     * @param str string
     */
    void setToast(String str);
}
