package model.dto;

public final class VehicleBuilder {
    private int id;
    private String patent;
    private Model model;
    private Branch branch;
    private String policyNumber;

    private VehicleBuilder() {
    }

    public static VehicleBuilder aVehicle() {
        return new VehicleBuilder();
    }

    public VehicleBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public VehicleBuilder withPatent(String patent) {
        this.patent = patent;
        return this;
    }

    public VehicleBuilder withModel(Model model) {
        this.model = model;
        return this;
    }

    public VehicleBuilder withBranch(Branch branch) {
        this.branch = branch;
        return this;
    }

    public VehicleBuilder withPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
        return this;
    }

    public Vehicle build() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        vehicle.setPatent(patent);
        vehicle.setModel(model);
        vehicle.setBranch(branch);
        vehicle.setPolicyNumber(policyNumber);
        return vehicle;
    }
}
