package BT.Assigment2.Service.impl;

import BT.Assigment2.Model.MotoBike;
import BT.Assigment2.Model.Truck;
import BT.Assigment2.Repository.IMotoBikeRepository;
import BT.Assigment2.Repository.impl.MotoBikeRepository;
import BT.Assigment2.Service.IMotoBikeService;

import java.util.List;
import java.util.Scanner;

public class MotoBikeService implements IMotoBikeService {
    public static Scanner scanner = new Scanner(System.in);
    public static IMotoBikeRepository iMotoBikeRepository = new MotoBikeRepository();
    @Override
    public void addingMotoBike() {
        MotoBike motoBike = this.infoMotoBike();
        iMotoBikeRepository.addingMotoBike(motoBike);
    }

    @Override
    public void showingMotoBike() {
        List<MotoBike> motoBikeList = iMotoBikeRepository.getAll();
        for (MotoBike motoBike : motoBikeList){
            System.out.println(motoBike);
        }
    }

    @Override
    public void removeMotoBike() {
        System.out.println("Enter motoBike's ID: ");
        int motoBikeID = scanner.nextInt();
        loop:
        while (true) {
            for (MotoBike motoBike : iMotoBikeRepository.getAll()) {
                if (motoBike.getId() == motoBikeID) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
                    if (scanner.nextInt() == 1) {
                        iMotoBikeRepository.getAll().remove(motoBike);
                        System.out.println("Remove success.");
                        break loop;
                    } else {
                        return;
                    }
                }
            }
            System.out.println("MotoBike isn't exist.");
            break;
        }
    }

    private MotoBike infoMotoBike(){
        System.out.print("Enter iD:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter producedBrand:");
        String produceBrand = scanner.nextLine();
        System.out.print("Enter productYear:");
        int produceYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter owner:");
        String owner = scanner.nextLine();
        System.out.print("Enter pressure:");
        int pressure = Integer.parseInt(scanner.nextLine());
        MotoBike motoBike = new MotoBike(id, produceBrand, produceYear, owner, pressure);
        return motoBike;
    }
}
