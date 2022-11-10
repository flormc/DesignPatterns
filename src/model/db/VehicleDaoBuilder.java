package model.db;

public final class VehicleDaoBuilder {
    private int id;
    private String patent;
    private int model;
    private int branch;
    private String policyNumber;

    private VehicleDaoBuilder() {
    }

    public static VehicleDaoBuilder aVehicleDao() {
        return new VehicleDaoBuilder();
    }

    public VehicleDaoBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public VehicleDaoBuilder withPatent(String patent) {
        this.patent = patent;
        return this;
    }

    public VehicleDaoBuilder withModel(int model) {
        this.model = model;
        return this;
    }

    public VehicleDaoBuilder withBranch(int branch) {
        this.branch = branch;
        return this;
    }

    public VehicleDaoBuilder withPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
        return this;
    }

    public VehicleDao build() {
        VehicleDao vehicleDao = new VehicleDao();
        vehicleDao.setId(id);
        vehicleDao.setPatent(patent);
        vehicleDao.setModel(model);
        vehicleDao.setBranch(branch);
        vehicleDao.setPolicyNumber(policyNumber);
        return vehicleDao;
    }
}
