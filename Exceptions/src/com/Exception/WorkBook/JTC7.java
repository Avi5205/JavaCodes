package com.Exception.WorkBook;

public class JTC7 {

	public static void main(String[] args) {
		StudentService serv = new StudentService();
		try {
			String nm = serv.getStudentName(-23);
			System.out.println("in Main Name\t:"+nm);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			String nm = serv.getStudentName(98);
			System.out.println("in Main Name\t:"+nm);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getCause());
			System.out.println("-------------");
			e.printStackTrace();
		}
		System.out.println();
		try {
			String nm = serv.getStudentName(99);
			System.out.println("in Main Name\t:"+nm);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getCause());
			System.out.println("-------------");
			e.printStackTrace();
		}
		System.out.println("\n--Main Completed--");
	}

}
class StudentService{
	String getStudentName(int id) {
		String nm = null;
		//DB Impl
		if(id < 1) {
			throw new InvalidIdException(id);
		}else if(id == 98) {
			StudentNotFoundException e = new StudentNotFoundException();
			e.initCause(new IdNotFoundException(id));
			throw e;
		}
		nm = "Somprakash";
		return nm;
	}
}
@SuppressWarnings("serial")
class InvalidIdException extends RuntimeException{
	int id;
	InvalidIdException(int id){
		this.id = id;
	}
	public String getMessage() {
		return String.valueOf(id);
	}
}
@SuppressWarnings("serial")
class StudentNotFoundException extends RuntimeException{}
@SuppressWarnings("serial")
class IdNotFoundException extends RuntimeException{
	int id;
	IdNotFoundException(int id){
		super(String.valueOf(id));
	}
}