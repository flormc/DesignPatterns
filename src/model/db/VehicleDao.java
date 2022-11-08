package model.db;

public class VehicleDao {
    private int id;
    private String patent;
    private int model;
    private int branch;
    private String policyNumber;

    public VehicleDao() {}

    public VehicleDao(int id, String patent, int model, int branch, String policyNumber) {
        this.id = id;
        this.patent = patent;
        this.model = model;
        this.branch = branch;
        this.policyNumber = policyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
