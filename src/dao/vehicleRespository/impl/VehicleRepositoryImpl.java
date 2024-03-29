package dao.vehicleRespository.impl;

import dao.ConnectionFacadeImpl;
import dao.clientRepository.ClientRepository;
import dao.vehicleRespository.VehicleRepository;
import model.db.ClientDao;
import model.db.VehicleDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleRepositoryImpl implements VehicleRepository {
    public static final String BY_CLIENT_ID = "SELECT * FROM vehicle v INNER JOIN client c ON v.id_client = c.cod_cliente where c.cod_cliente = ?";
    public static final String CREATE_VEHICLE_INSERT = "INSERT INTO vehicle VALUES (?, ?, ?, ?, ?)";
    private ConnectionFacadeImpl connectionFacade;

    public VehicleRepositoryImpl(ConnectionFacadeImpl connectionFacade) {
        this.connectionFacade = connectionFacade;
    }

    @Override
    public List<VehicleDao> getVehicleByClient(int clientId) throws SQLException, ClassNotFoundException {
        final Connection connection = connectionFacade.startConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(BY_CLIENT_ID);
        preparedStatement.setInt(1, clientId);

        ResultSet rs = preparedStatement.executeQuery();

        return Optional.ofNullable(fillDao(rs))
                .get().orElseThrow(RuntimeException::new);
    }

    @Override
    public VehicleDao createVehicleByClient(VehicleDao vehicule, long clientId) throws SQLException, ClassNotFoundException {
        final Connection connection = connectionFacade.startConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE_VEHICLE_INSERT);
        preparedStatement.setInt(2, vehicule.getModel());
        preparedStatement.setInt(3, vehicule.getBranch());
        preparedStatement.setString(4, vehicule.getPolicyNumber());
        preparedStatement.setLong(5, clientId);

        preparedStatement.executeUpdate();
        return null;
    }

    private Optional<List<VehicleDao>> fillDao(ResultSet rs) throws SQLException {
        VehicleDao vehicleDao;
        List<VehicleDao> vehicleDaos = new ArrayList<>();
        while(rs.next()) {
            vehicleDao = new VehicleDao();
            vehicleDao.setModel(rs.getInt("model"));
            vehicleDao.setBranch(rs.getInt("branch"));
            vehicleDao.setPolicyNumber(rs.getString("policy_number"));
            vehicleDaos.add(vehicleDao);
        }

        return Optional.of(vehicleDaos);
    }
}
