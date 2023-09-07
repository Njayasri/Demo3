package in.micro.daofactory;

import in.micro.dao.IStudentDao;
import in.micro.dao.StudentDaoImpl;
public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static in.micro.dao.IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
