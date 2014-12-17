package test.service.user.mgmt;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.springframework.stereotype.Service;

import test.service.pojo.Person;

@Service
public class UserMgmtServiceImpl implements IUserMgmtService {

	@Override
	public List<Person> getPersonList() {
		
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("Manik", "bathinda", 21));
		list.add(new Person("Megha", "bathinda", 21));
		list.add(new Person("Bhanu", "bathinda", 21));
		list.add(new Person("Rakesh", "bathinda", 21));
		list.add(new Person("Seema", "bathinda", 21));
		return list;
	}

}
