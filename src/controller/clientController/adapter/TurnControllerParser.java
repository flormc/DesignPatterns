package controller.clientController.adapter;

import model.db.TurnDao;
import model.db.VehicleDao;
import model.dto.Branch;
import model.dto.Model;
import model.dto.Specialty;
import model.dto.StateTurn;
import model.dto.Turn;
import model.dto.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class TurnControllerParser {

    public static List<Turn> convertListVehicleDaoToDTO(List<TurnDao> turnDaos) {
        return turnDaos.stream().map(TurnControllerParser::convertTurnDaoToDTO)
                .collect(Collectors.toList());
    }

    public static Turn convertTurnDaoToDTO(TurnDao turnDao) {
        Turn turn = new Turn();
        turn.setId(turnDao.getId());
        turn.setCreateDate(turnDao.getCreateDate());
        turn.setModifyDate(turnDao.getModifyDate());
        turn.setTime(turnDao.getTime());
        turn.setSpecialty(Specialty.getEnum(turnDao.getSpecialty()));
        turn.setStateTurn(StateTurn.getEnum(turnDao.getStateTurn()));

        return turn;
    }
}
