package dao.turnRepository.impl;

import dao.ConnectionFacadeImpl;
import dao.turnRepository.TurnRepository;
import dao.vehicleRespository.VehicleRepository;
import model.db.TurnDao;
import model.db.VehicleDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TurnRepositoryImpl implements TurnRepository {
    public static final String BY_CLIENT_ID = "SELECT * FROM turn t INNER JOIN client c ON t.cod_client = ?";
    private ConnectionFacadeImpl connectionFacade;

    public TurnRepositoryImpl(ConnectionFacadeImpl connectionFacade) {
        this.connectionFacade = connectionFacade;
    }

    @Override
    public List<TurnDao> getAllTurnByClient(int clientId) throws SQLException, ClassNotFoundException {
        final Connection connection = connectionFacade.startConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(BY_CLIENT_ID);
        preparedStatement.setInt(1, clientId);

        ResultSet rs = preparedStatement.executeQuery();

        return Optional.ofNullable(fillDao(rs))
                .get().orElseThrow(RuntimeException::new);
    }

    private Optional<List<TurnDao>> fillDao(ResultSet rs) throws SQLException {
        TurnDao turnDao;
        List<TurnDao> turnDaos = new ArrayList<>();
        while (rs.next()) {
            turnDao = new TurnDao();
            turnDao.setId(rs.getInt("id"));
            turnDao.setCreateDate(rs.getDate("create_date").toLocalDate());
            turnDao.setModifyDate(getCreate_date(rs));
            turnDao.setTime(rs.getString("hour"));
            turnDao.setStateTurn(rs.getInt("state"));
            turnDaos.add(turnDao);
        }

        return Optional.of(turnDaos);
    }

    private LocalDate getCreate_date(ResultSet rs) throws SQLException {
        return  rs.getDate("modify_date") == null ? null :
                rs.getDate("modify_date").toLocalDate();
    }
}
