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
    public static final String BY_CLIENT_ID = "SELECT * FROM vehicle v INNER JOIN client c ON v.id_client = ?";
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

    private Optional<List<VehicleDao>> fillDao(ResultSet rs) throws SQLException {
        VehicleDao vehicleDao;
        List<VehicleDao> vehicleDaos = new ArrayList<>();
        while(rs.next()) {
            vehicleDao = new VehicleDao();
            vehicleDao.setPatent(rs.getString("patent"));
            vehicleDao.setModel(rs.getInt("model"));
            vehicleDao.setBranch(rs.getInt("branch"));
            vehicleDao.setPolicyNumber(rs.getString("policy_number"));
            vehicleDaos.add(vehicleDao);
        }

        return Optional.of(vehicleDaos);
    }
}
