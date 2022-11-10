package controller.clientController.adapter;

import model.db.VehicleDao;
import model.db.VehicleDaoBuilder;
import model.dto.Branch;
import model.dto.Model;
import model.dto.Vehicle;
import model.dto.VehicleBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleControllerParser {

    public static List<Vehicle> convertListVehicleDaoToDTO(List<VehicleDao> vehicleDao) {
        return vehicleDao.stream().map(VehicleControllerParser::convertVehicleDaoToDTO)
                .collect(Collectors.toList());
    }

    public static Vehicle convertVehicleDaoToDTO(VehicleDao vehicleDao) {
        return VehicleBuilder.aVehicle()
                .withPolicyNumber(vehicleDao.getPolicyNumber())
                .withModel(Model.getEnum(vehicleDao.getModel()))
                .withBranch(Branch.getEnum(vehicleDao.getBranch()))
                .build();
    }

    public static VehicleDao convertVehicleDTOToDao(Vehicle vehicle) {
        return VehicleDaoBuilder.aVehicleDao()
                .withPolicyNumber(vehicle.getPolicyNumber())
                .withModel(vehicle.getModel().getCode())
                .withBranch(vehicle.getBranch().getCode())
                .build();
    }
}
