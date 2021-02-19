package pattpack.account;

/**
 *  Security manager of an economy account.
 */
public class SecurityManagerProfessional extends SecurityManagerIF {
    private static final int max = 1000;
    /** Maximum connection hours per months. */
    private static final int connectionHoursLimit = max;
    /** Maximum connection speed. */
    private static final int connectionSpeedLimit = max;
    /**
     *  Return the maximum connection hours per months.
     *  @return the maximum connection hours per months.
     */
    public int getConnectionHours () { return connectionHoursLimit; }

    /**
     *  Return the maximum connection speed.
     *  @return the maximum connection speed.
     */
    public int getConnectionSpeed () { return connectionSpeedLimit; }

    /**
     *  String representation of an economy security manager.
     *  @return the representation of an economy security manager.
     */
    public String toString () { return "SecurityManagerProfessional"; }
}
