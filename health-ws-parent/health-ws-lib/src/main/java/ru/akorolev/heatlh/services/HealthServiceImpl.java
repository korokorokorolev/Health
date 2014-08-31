package ru.akorolev.heatlh.services;

import ru.health.akorolev.health.ws.query.GetTrainersRequest;
import ru.health.akorolev.health.ws.query.GetTrainersResponse;
import ru.health.akorolev.health.ws.query.HealthService;
import ru.health.akorolev.health.ws.query.Trainer;

import javax.jws.WebParam;

/**
 * Created with IntelliJ IDEA.
 * User: akorolev
 * Date: 31.08.14
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 */
public class HealthServiceImpl implements HealthService {
    @Override
    public GetTrainersResponse getTrainers(GetTrainersRequest request) {
        GetTrainersResponse response = new GetTrainersResponse();
        Trainer trainer = new Trainer();
        trainer.setLastName("lol");
        response.setTrainers(trainer);
        return response;
    }
}
