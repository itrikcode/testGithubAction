package in.itsp.test.service;

import in.itsp.test.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    ArrayList<String> list = new ArrayList<>();

    public String save(Employee e){
        System.out.println(e.getName());
           list.add(e.getName());
           list.add(e.getAddress());

        System.out.println(Arrays.asList(list));
       if(list.isEmpty()){
           return "failed";
       }else {
           return "save";
       }
    }

    public List<String> getAll(){
        for (String l : list){
            System.out.println(l);
        }

       return list;

    }
}
