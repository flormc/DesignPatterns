package dao.turnRepository;

import model.db.TurnDao;

import java.sql.SQLException;
import java.util.List;

public interface TurnRepository {

    List<TurnDao> getAllTurnByClient(int clientId) throws SQLException, ClassNotFoundException;
}
