public class Context implements DataConnectionState{
    private DataConnectionState state;

    public DataConnectionState getState() {
        return state;
    }

    public void setState(DataConnectionState state) {
        this.state = state;
    }


    @Override
    public void info() {
        this.state.info();
    }
}
