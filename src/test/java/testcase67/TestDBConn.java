package testcase67;

import java.sql.SQLException;

import utilities.DbManager;

public class TestDBConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("select tuyorial_author from selenium where tutorial_id=2"));
	}

}
