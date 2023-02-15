package BT.Assigment2.Repository;

import BT.Assigment2.Model.MotoBike;

import java.util.ArrayList;
import java.util.List;

public interface IMotoBikeRepository {
    void addingMotoBike(MotoBike motoBike);
    List<MotoBike> getAll();
}
