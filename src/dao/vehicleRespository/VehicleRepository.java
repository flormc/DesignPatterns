package dao.vehicleRespository;

import model.db.VehicleDao;

import java.sql.SQLException;
import java.util.List;

public interface VehicleRepository {

    List<VehicleDao> getVehicleByClient(int clientId) throws SQLException, ClassNotFoundException;

    VehicleDao createVehicleByClient(VehicleDao Vehicule, long clientID) throws SQLException, ClassNotFoundException;
}
