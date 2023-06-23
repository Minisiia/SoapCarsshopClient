package soap_carsshop_server.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CarShopDAO {

    @WebMethod
    List<String> getAllMarks();


}