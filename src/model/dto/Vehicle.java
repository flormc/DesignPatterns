package model.dto;

public class Vehicle {
    private int id;
    private String patent;
    private Model model;
    private Branch branch;
    private String policyNumber;

    public Vehicle() {}

    public Vehicle(int id, String patent, Model model, Branch branch, String policyNumber) {
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
