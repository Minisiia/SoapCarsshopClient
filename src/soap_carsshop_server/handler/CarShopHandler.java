package soap_carsshop_server.handler;

import soap_carsshop_server.service.CarShopDAO;

import java.util.List;

public class CarShopHandler {
    public static void printAllMarks(CarShopDAO carShopDAO) {
        System.out.println("\nMarks:");
        printList(carShopDAO.getAllMarks());
    }


    public static void printMarkById(CarShopDAO carShopDAO, int id) {
        System.out.println("\nCars mark with id " + id + ": " + carShopDAO.getMarkById(id));
    }


    public static void printAllCars(CarShopDAO carShopDAO){
        System.out.println("\nCars:");
        printList(carShopDAO.getAllCars());
    }


    public static void printCarById(CarShopDAO carShopDAO, int id){
        System.out.println("\nCar with id " + id + ": " + carShopDAO.getCarById(id));
    }


    public static void printAllClients(CarShopDAO carShopDAO){
        System.out.println("\nClients:");
        printList(carShopDAO.getAllClients());
    }


    public static void printClientById(CarShopDAO carShopDAO, int id){
        System.out.println("\nClient with id " + id + ": " + carShopDAO.getClientById(id));
    }


    public static void printAllOrdersInfo(CarShopDAO carShopDAO){
        System.out.println("\nFull orders info:");
        printList(carShopDAO.getAllOrdersInfo());
    }

    private static <E> void printList(List<E> list) {
        for (E temp : list) {
            System.out.println(temp);
        }
    }
}
