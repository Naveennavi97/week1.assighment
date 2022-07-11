package week1.day2;

public class myMobile {
     String name="redmi";
     int model=2022;
     char type = 'D';
     	public void makeCall() {
     		System.out.println("yes");
			

		}
       private void sendMsg() {
        System.out.println("hi ");
	}
        public static void main(String[] args) {
        	myMobile note = new myMobile();
        	note.makeCall();
        	note.sendMsg();
        	System.out.println(note.model);
        	System.out.println(note.name);
        	System.out.println(note.type);
        	
			
		}
     
}
