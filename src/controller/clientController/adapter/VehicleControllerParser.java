package controller.clientController.adapter;

import model.db.VehicleDao;
import model.dto.Branch;
import model.dto.Model;
import model.dto.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleControllerParser {

    public static List<Vehicle> convertListVehicleDaoToDTO(List<VehicleDao> vehicleDao) {
        return vehicleDao.stream().map(VehicleControllerParser::convertVehicleDaoToDTO)
                .collect(Collectors.toList());
    }

    public static Vehicle convertVehicleDaoToDTO(VehicleDao vehicleDao) {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleDao.getId());
        vehicle.setPatent(vehicleDao.getPatent());
        vehicle.setBranch(Branch.getEnum(vehicleDao.getId()));
        vehicle.setModel(Model.getEnum(vehicleDao.getModel()));
        vehicle.setPolicyNumber(vehicleDao.getPolicyNumber());

        return vehicle;
    }
}
