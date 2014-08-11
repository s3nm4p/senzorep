package timetabling;

public class SubjectTeacher {

	private String teacher;
	private String subject;
	private int subcode;
	private int teachercode;
	
	public SubjectTeacher(String subj,String teacher){
		this.teacher=teacher;
		this.subject=subj;
	}
	
	public SubjectTeacher(int subcode,int teachcode, String subj,String teacher){
		this.teacher=teacher;
		this.subject=subj;
		this.subcode=subcode;
		this.teachercode=teachcode;
	}
	
	public String getTeacher(){
		return teacher;
	}
	
	public String getSubject(){
		return subject;
	}
	public int getSubCode(){
		return subcode;
	}
	public int getTeachCode(){
		return teachercode;
	}
	
	
	 boolean equals(SubjectTeacher st2){
		 
		 if(getTeacher().equals(st2.getTeacher())&&getSubject().equals(st2.getSubject()))
			 return true;
		 else
			 return false;
		 
	 }
}
