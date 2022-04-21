package definedexception;

public class Student {
	String StudentID;
    String StudentName;
    
    public Student(String StudentID , String StudentName) {
    	this.StudentID=StudentID;
        this.StudentName=StudentName;
    	
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student student=new Student("It_123","Sandhya");
		Source s=new Source();
        String res=s.ValidateStudent(student);
        System.out.println(res);
        String res1=s.ValidateUserId(student);
        System.out.println(res1);
	}

}

class Source{
	public String ValidateStudent(Student std) throws InvalidStudentNameException {
		
		if(!(Character.isUpperCase(std.StudentName.charAt(0)) && 
				std.StudentName.substring(1).equals(std.StudentName.substring(1).toLowerCase()))) {
			try{
                throw new InvalidStudentNameException("Invalid Name");
            }
            catch(Exception e)
            {
                //System.out.println(e);
                std.StudentName="Invalid";
                return e.toString();
            }
           
			
		}
		else
		{
			std.StudentName="Valid";
			return std.StudentName;
		}
		
	}
	
	public String ValidateUserId(Student std) throws InvalidStudentNameException {
		//char c = std.StudentID.charAt(0);
		/*if(!(Character.isUpperCase(std.StudentID.charAt(0)) && 
				std.StudentID.substring(1).equals(std.StudentID.substring(1).toLowerCase()) 
				&& std.StudentID.length()>=5 && std.StudentID.length()<=20 && Character.isAlphabetic(c)
						&& std.StudentID.matches("^[A-Z]\\w{4, 19}$")))*/
		if(!(std.StudentID.matches("^[A-Z]\\w{4,19}$") && 
				std.StudentID.substring(1).equals(std.StudentID.substring(1).toLowerCase()))) {
			try{
                throw new InvalidStudentNameException("Invalid Name");
            }
            catch(Exception e)
            {
                //System.out.println(e);
            	std.StudentID="Invalid";
            	 return e.toString();
            }
           
			
		}
		else
		{
				std.StudentID="Valid";
				return std.StudentID;
		}
		
	}
}

class InvalidStudentNameException extends Exception{
	public InvalidStudentNameException(String msg) {
		super(msg);
	}
}