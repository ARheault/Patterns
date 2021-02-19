public interface Mutable extends Immutable {

    /**
     * This sends the value the user would like to set to the position class for the x coordinate.
     * @param toSet The value to send to the position.
     */
    public void setX(int toSet);

    /**
     * This sends the value the user would like to set to the position class for the y coordinate.
     * @param toSet The value to send to the position.
     */
    public void setY(int toSet);
}