package soap_carsshop_server;

import soap_carsshop_server.service.CarShopDAO;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main{
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/SoapCarsshopServer/CarShopDAOImplService?wsdl");
        QName qName = new QName("http://service.soap_carsshop_server/", "CarShopDAOImplService");
        Service service = Service.create(url, qName);
        QName port = new QName("http://service.soap_carsshop_server/", "CarShopDAOImplPort");
        CarShopDAO carShopDAO = service.getPort(port, CarShopDAO.class);
        List<String> marks = carShopDAO.getAllMarks();
        System.out.println("Марки автомобилей:");
        for (String mark : marks) {
            System.out.println(mark);
        }
    }
}
