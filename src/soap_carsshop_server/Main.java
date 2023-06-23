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
       // URL url = new URL("http://localhost:8080/test3_war_exploded/CarShopDAOImplService?WSDL");

        QName qName = new QName("http://service.soap_carsshop_server/", "CarShopDAOImplService");
       // QName qName = new QName("http://service/", "CarShopDAOImplService");
        Service service = Service.create(url, qName);
        System.out.println(qName);
        System.out.println(service);

        QName port = new QName("http://service.soap_carsshop_server/", "CarShopDAOImplPort");
       // QName port = new QName("http://service/", "CarShopDAOImplPort");
        System.out.println(port);
        CarShopDAO tv = service.getPort(port, CarShopDAO.class);
        System.out.println(tv);
        List<String> marks = tv.getAllMarks();
        System.out.println("Марки автомобилей:");
        for (String mark : marks) {
            System.out.println(mark);
        }
    }

}
