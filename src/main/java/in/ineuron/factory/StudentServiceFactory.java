package in.ineuron.factory;

import in.ineuron.service.IStudentService;
import in.ineuron.service.IStudentServiceImpl;

public class StudentServiceFactory {
	private static IStudentService studentservice = null;

	private StudentServiceFactory() {

	}

	public static IStudentService getStudentService() {

		if (studentservice == null) {
			studentservice = new IStudentServiceImpl();
		}

		return studentservice;
	}
}
