package controller.clientController.adapter;

import model.db.TurnDao;
import model.dto.Speciality;
import model.dto.StateTurn;
import model.dto.Turn;
import model.dto.TurnBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class TurnControllerParser {

    public static List<Turn> convertListVehicleDaoToDTO(List<TurnDao> turnDaos) {
        return turnDaos.stream().map(TurnControllerParser::convertTurnDaoToDTO)
                .collect(Collectors.toList());
    }

    public static Turn convertTurnDaoToDTO(TurnDao turnDao) {
        return TurnBuilder.aTurn()
                .withId(turnDao.getId())
                .withCreateDate(turnDao.getCreateDate())
                .withModifyDate(turnDao.getModifyDate())
                .withTime(turnDao.getTime())
                .withSpecialty(Speciality.getEnum(turnDao.getSpecialty()))
                .withStateTurn(StateTurn.getEnum(turnDao.getStateTurn()))
                .build();

    }
}
