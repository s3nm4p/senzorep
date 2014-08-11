package timetabling;

import java.util.*;

public class TimeTable {

	private SubjectTeacher[][] day;
	private ArrayList<String> teachers;
	private ArrayList<String> subjects;
	private ArrayList<SubjectTeacher> subteach;
	private int Nc,NPs,Nd,Np;
	private Random ran;
	int temp =0;
	
	public TimeTable(Random random,int classes,int periods,ArrayList<String> teachers,ArrayList<String> subjs,
			ArrayList<SubjectTeacher>stech){
		ran=random;
		Nc=classes;
		Np=periods;
		this.teachers=teachers;
		this.subjects=subjs;
		subteach=stech;
		day = new SubjectTeacher[Nc][Np];
	}
	public void run(){
		makeDay();
		displayTimeTable(day);
	}
	//Randomly generate a timetable t	
	public void makeDay(){
		for(int row=0;row<Nc;row++){
			for(int col=0;col<Np;col++){
				int pos = ran.nextInt(subteach.size());
				day[row][col]=subteach.get(pos);
			}			
		}		
	}
	
	// for each teacher check violation of constrain1
	int checkH1(SubjectTeacher st){
		
		int v=0;
		
		for(int col=0;col<Np;col++){
			int appear=0;
			for(int row=0;row<Nc;row++){
				if(day[row][col].equals(st))
					appear++;

			}	
			
			if(appear>1)
				v++;
		}
		return v;
	}	
	
	public void checkArray(SubjectTeacher[][] tday){
		
		
	}
	public void displayTimeTable(SubjectTeacher[][] stch){
		for(int i=0;i<Nc;i++){
			for(int j=0;j<Np;j++)
				System.out.print("("+stch[i][j].getSubject()+","+stch[i][j].getTeacher()+")");
			System.out.println();
		}
	}
	
	public SubjectTeacher[][] getDay(){
		return day;
	}
	
	public void setSubjects(ArrayList<String> sbjts){
            this.subjects=sbjts;
        }
        public void setTeachers(ArrayList<String> tchrs){
            this.teachers=tchrs;
        }
        public void setSubteach(ArrayList<SubjectTeacher> sbtch){
            this.subteach=sbtch;
        }
}
