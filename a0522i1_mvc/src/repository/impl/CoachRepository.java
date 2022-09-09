package repository.impl;

import model.Coach;
import repository.ICoachRepository;

import java.util.ArrayList;
import java.util.List;

public class CoachRepository implements ICoachRepository {
    private static List<Coach> coachList = new ArrayList<>();

    @Override
    public void addCoach(Coach coach) {
        coachList.add(coach);
    }

    @Override
    public List<Coach> getAll() {
        return coachList;
    }
}
