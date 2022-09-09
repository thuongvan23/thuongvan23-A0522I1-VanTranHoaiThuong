package repository;

import model.Coach;

import java.util.List;

public interface ICoachRepository {
    void addCoach (Coach coach);
    List<Coach> getAll();
}
