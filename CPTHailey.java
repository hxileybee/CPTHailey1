import arc.*;
import java.awt.Color;
import java.awt.Font;

public class CPTHailey{
	public static void main(String[] args){
		Console con = new Console("Multiple Choice Game", 1280, 720);
		
		/*SCREEN COLOUR
		int intx = 550;
		
		while(intx > 0){
			con.setDrawColor(Color.WHITE);
			con.fillRect(0, 0, 1280, 720);
		}*/
		
		//BASIC CODE OUTLINE BELOW
		
		int intanswer;
		String strname;
		
		con.println("MULTIPLE CHOICE QUIZZES");
		con.println("PLAY GAME (1)");
		con.println("VIEW LEADERBOARD (2)");
		con.println("ADD QUIZ (3)");
		con.println("QUIT (4)");
		intanswer = con.readInt();
		//maybe have this as a mouse input??? 
		//as well as other choice options like this
		//picking answers will be keyboard input tho!!!
		
		if(intanswer == 1){
			int intquiz;
			String strtemp;
			int intnumrand = 0;
			
			con.println("\nWhat is your name?");
			strname = con.readLine();
			
			con.println("PICK YOUR QUIZ");
			con.println("Transformers.txt (1)");
			con.println("Ocean.txt (2)");
			con.println("Lifesaving.txt (3)");
			intquiz = con.readInt();

			if(intquiz == 1){
				TextInputFile transform = new TextInputFile("Transformers.txt");
				while(transform.eof() == false){
					strtemp = transform.readLine();
					intnumrand = intnumrand + 1;
				}
				transform.close();
				
				int intcount;
				
				for(intcount = 0; intcount < intnumrand; intcount++){

				}
			}
		}
	}
}
