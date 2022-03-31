package softuni.exam.service;



import org.springframework.stereotype.Service;
import softuni.exam.models.entity.Car;

import java.io.IOException;


public interface CarService {

    boolean areImported();

    String readCarsFileContent() throws IOException;
	
	String importCars() throws IOException;

    String getCarsOrderByPicturesCountThenByMake();

    Car findById(Long car);
}
