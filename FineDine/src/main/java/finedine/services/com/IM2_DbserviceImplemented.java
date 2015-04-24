package main.java.finedine.services.com;

import main.java.finedine.dao.com.IM2_Dao;
import main.java.finedine.entitypojo.com.UsersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class IM2_DbserviceImplemented implements IM2_Dbservice {
 
    @Autowired
    IM2_Dao im2DAO;

	@Transactional
	public boolean usersTable(UsersEntity record) {
		return im2DAO.usersTable(record);
	}
}