public class PrivateCouch extends Couch {
    @Override
    public String getCouchType() {
        return this.couchType="privateCouch";
    }

    @Override
    public Double getCharge() {
        return this.charge=500.00;
    }

    @Override
    public int getCapacity() {
       return this.capacity=2;
    }
}
