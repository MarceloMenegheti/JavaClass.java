package util;

import entities.Employee;

import java.util.List;
import java.util.function.Predicate;

public class ProductServise {
    public double filteredSum(List<Employee> list, Predicate<Employee> criteria){

        //criteria =  p -> p.getName().charAt(0) == 'M'

        double sum = 0.0;

        for(Employee p : list){
           if(criteria.test(p)){
               sum += p.getSalary();
           }
        }
        return sum;
    };
}
