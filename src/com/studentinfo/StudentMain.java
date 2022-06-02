package com.studentinfo;

import java.util.*;

public class StudentMain {
	


	public static void main(String[] args) {
		int i;
		List<Student> s = new ArrayList<Student>();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Inserting ther record\nEnter 2 for Reading ther record\nEnter 3 for Deleting ther record\nEnter 4 for updating ther record\nEnter 0 for Exiting the program.!!!\n");
		
		do {
			
			System.out.println("1. Insert");
			System.out.println("2. Read");
			System.out.println("3. Delete");
			System.out.println("4. Udate");
			System.out.println("5. ReadById\n");
			
			System.out.println("Enter Your choice: ");
			i = sc.nextInt();
			
			switch(i) {
				case 1:
					System.out.println("Enter the Id: ");
					int sid = sc.nextInt(); 
					System.out.println("Enter the Name: ");
					String sname = sc.next();
					System.out.println("Enter the Surname: ");
					String ssname = sc.next();
					System.out.println("Enter the City: ");
					String scity = sc.next();
					Student s1=new Student();
					s1.setId(sid);
					s1.setName(sname);
					s1.setSname(ssname);
					s1.setCity(scity);
					s.add(s1);
					break;
				case 2:
					  Iterator<Student> itr=s.iterator(); 
					  while(itr.hasNext()) {
						  Student s2 = itr.next();
						  System.out.println(s2);
					  }
					
					break;
				case 3:
					boolean found = false;
					System.out.println("Enter sid to delete :");
					sid = sc.nextInt();
					 itr=s.iterator(); 
					  while(itr.hasNext()) {
						 Student s2 = itr.next();
						 if(s2.getId()==sid) {
							 itr.remove();
							 found = true;
						 }
						 }
					  if(!found) {
						  System.out.println("Not Founded");
					  }else {
						  System.out.println("Data deleted");
					  }
					break;	
					
				case 4:
					found = false;
					System.out.println("Enter sid to update");
					sid = sc.nextInt();
					
					ListIterator<Student> list = s.listIterator();
					
					while(list.hasNext()) {
						Student s3 = list.next();
						if(s3.getId() == sid) {
	
							System.out.println("a. Student Name:");
							System.out.println("b. Student Surname:");
							System.out.println("c. Student City:");
							System.out.println("What you want to change:");
							String ch = sc.next();
						
							switch(ch) {
								case "a":
									System.out.println("Enter new name: ");
									sname = sc.next();
									s3.setName(sname);
									break;
								case "b":
									System.out.println("Enter new surname: ");
									ssname = sc.next();
									s3.setSname(ssname);
									break;
								case "c":
									System.out.println("Enter new city: ");
									scity = sc.next();
									s3.setCity(scity);
									break;
							}
							
					found=true;
						}
					}
					
					if(!found) {}
					break;
				case 5:
					found = false;
					System.out.println("Enter sid to Read");
					sid = sc.nextInt();
					
					ListIterator<Student> list1 = s.listIterator();
					
					while(list1.hasNext()) {
						Student s3 = list1.next();
						if(s3.getId()==sid) {
							System.out.println(s3);
						}
						}
						
					break;
					
				case 0:
					System.out.println("Exit!!");
					
					
			}
		}while(i!=0);
	}

}
