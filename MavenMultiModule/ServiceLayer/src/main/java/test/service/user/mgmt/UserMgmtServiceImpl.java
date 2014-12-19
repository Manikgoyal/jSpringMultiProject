package test.service.user.mgmt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techdazzler.dao.PersonDao;

import test.service.pojo.Person;

@Repository
public class UserMgmtServiceImpl implements IUserMgmtService {

	@Autowired
	PersonDao personDao;
	
	@Override
	public List<Person> getPersonList() {
		
		List<Person> list1= personDao.allPerson();
		System.out.println("List1=="+list1);
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("Manik", "bathinda", 21));
		list.add(new Person("Megha", "bathinda", 21));
		list.add(new Person("Bhanu", "bathinda", 21));
		list.add(new Person("Rakesh", "bathinda", 21));
		list.add(new Person("Seema", "bathinda", 21));
		return list;
	}


}
