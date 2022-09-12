package BT.Assigment2.Repository.impl;

import BT.Assigment2.Model.MotoBike;
import BT.Assigment2.Repository.IMotoBikeRepository;

import java.util.ArrayList;
import java.util.List;

public class MotoBikeRepository implements IMotoBikeRepository {
    private static List<MotoBike> motoBikeList = new ArrayList<>();
    @Override
    public void addingMotoBike(MotoBike motoBike) {
        motoBikeList.add(motoBike);
    }
    @Override
    public List<MotoBike> getAll() {
        return motoBikeList;
    }
}
