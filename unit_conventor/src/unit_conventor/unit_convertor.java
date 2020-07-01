package unit_conventor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class unit_convertor {
	
	static int master = 99  ,black = 0, defualt = 99; static String name1 = "" , name2 = "" , end = "" , finaly = ""; static double one = 0; static int stop =99;
	
	public static void main(String[] args) {
	boolean system = true ,weight=false , length=false , temperature = false,time = false,programmer = false;	int type = 100 , koko = 99 ; double base= 0.0000000001 ; int fly = 99; 
	
	while(system) {                                 //all program 
	type=boot_up();                         		//choosing what to convert
	if (type == 5) {system = false; bye();} 		//5 == close program
	else if(type==0) {weight = true;}							else if(type==1) {length = true;}			else if(type==2) {temperature = true;}	
	else if(type==3) {time = true;}								else if(type==4) {programmer = true;}             //choosing what loop will play
	//=====================================================================================================
	while(weight) {
		koko = weigth_();                           //selecting a part
		if (koko==14) {								//14 = cancle the curent converting not close program
		weight=false; break;         
		}else if (koko ==15) {                      //15 = close system
		bye(); weight=false; system = false; break;}
		
		base=enter(type,koko);	      
		// getting input 
		base= dbase(type,koko,base);   //getting all to killogram
		fly = weigth_();               //what u want to convert to 
		if (fly==14) {                 //14=close the curent converting
		weight=false; break;
		}else if (fly ==15) {		   //shut down the system
		bye(); weight=false; system = false; break;}
		
		base=fbase(type,fly,base);     // final result
		result(base);}				   //final result printing
	//======================================================================================================
	while(length) {
		koko=length();
		if (koko==10) {								//10 = cancle the curent converting not close program
		length=false; break;         
		}else if (koko ==11) {                      //11 = close system
		bye(); length=false; system = false; break;}
		
		base=enter(type,koko);	       // getting input
		base= dbase(type,koko,base);   //getting all to killometers
		fly = length();
		if (fly==10) {                 //14=close the curent converting
		length=false; break;
		}else if (fly ==11) {		   //shut down the system
		bye(); length=false; system = false; break;}
		base=fbase(type,fly,base);     // final result
		result(base);}				   //final result printing
	//=======================================================================================================
	while(temperature) {
		koko = temperature();
		if (koko==6) {								//6 = cancle the curent converting not close program
		temperature=false; break;         
		}else if (koko ==7) {                       //7 = close system
		bye(); temperature=false; system = false; break;}
		
		
		base=enter(type,koko);	       // getting input
		base=fbase(type,koko,base);     // final result
		costum_result(base);}
	//=======================================================================================================
	while(time) {
		koko = time();
		if (koko==6) {							    //6 = cancle the curent converting not close program
		time=false; break;         
		}else if (koko ==7) {                      //7 = close system
		bye(); time=false; system = false; break;}
		
		base=enter(type,koko);	       // getting input
		base= dbase(type,koko,base);   //getting all to hours
		fly = time();
		if (fly==6) {                 //6=close the curent converting
		length=false; break;
		}else if (fly ==7) {		   //7 = shut down the system
		bye(); length=false; system = false; break;}
		base=fbase(type,fly,base);     // final result
		result(base);}
	//=======================================================================================================
	while(programmer) {
		koko = program();
		if (koko==4) {							    //4 = cancle the curent converting not close program
		programmer=false; break;         
		}else if (koko ==5) {                       //5 = close system
		bye(); programmer=false; system = false; break;}
		base=enter(type,koko);	       // getting input && change to decimel
		
		fly = program();
		if (fly==4) {                 //4=close the curent converting
		programmer=false; break;
		}else if (fly ==5) {		   //5 = shut down the system
		bye(); programmer=false; system = false; break;}
		base=fbase(type,fly,base);     // final result
		costum2();}}}
	//=======================================================================================================
	public static int boot_up() {											// starting
		ImageIcon limit = new ImageIcon ("limit.png");
		int type = 99;
		String types = "weight";
		String up = "welcom to unit convertor application";
		String option [] = {"Weight" ,  "Length" , "Temperature" , "Time" , "programmer" , "close the app"};
		String adv = "please choose what kind of data you want to convert";
		
		types = (String)JOptionPane.showInputDialog(null , adv , up , 1 ,limit , option , option[4] );
		if (types == null) {types = option[5];}
		type = worker(types,option);	return type ;	}
	//--------------------------------------------------------------------------------------------
	public static int weigth_() {                                // start up weight
		ImageIcon wei = new ImageIcon ("wei.png");
		int type = 99; String adv = "";
		String types = "Kilograms";
		String up = "converting weighth types";
		String option [] = {"Carats" ,  "Milligrams" , "Centigrams" , "Decigrams" , "Grams" , "Dekagrams" , "Hectograms" , "Kilograms" , "Metric tonnes" , "Ounces" , "Pounds" , "stone" , "Short tones (US)" ,"Long tones (UK)" , "close weight convertor" , "close the unit convertor calculater"};
		
		if(black ==0) { 
		adv = "please choose what kind of weigth you want convert from:";
		} else if (black ==1 ) {
		adv = "convert " + name1 + " to: ";}
		
		types = (String)JOptionPane.showInputDialog(null , adv , up , 1 ,wei , option , option[7] );
		if (types == null) {types= option[15];}		
		type = worker(types,option);
		
		if(black ==0) { 
			name1 = option[type];
			} else if (black ==1 ) {
			name2 = option[type];}
		
		black = 0; return type;	}
	//---------------------------------------------------------------------------------------------
	public static int worker(String types , String option[]) {   //give u option number
		int type = 99;
		for(int f = 0 ; f<option.length ; f++) {
		if(types==option[f]) {
		type = f; 
		break;}}  return type ;}
	//---------------------------------------------------------------------------------------------
	 public static void bye() {                         //bye message
			ImageIcon bye99 = new ImageIcon ("bye99.png");
		 JOptionPane.showMessageDialog(null, "thanks for using our unit convertor hope to see you soon.","aplication closing", JOptionPane.INFORMATION_MESSAGE , bye99);}
	//---------------------------------------------------------------------------------------------
	public static double enter(int type , int koko ) {                         //entering input from user
		ImageIcon wei = new ImageIcon ("wei.png");
		ImageIcon len = new ImageIcon ("len.png");
		ImageIcon time = new ImageIcon ("time.png");
		ImageIcon temp = new ImageIcon ("temp.png");
		ImageIcon binary = new ImageIcon ("binary.png");
		ImageIcon error = new ImageIcon ("error.png");

		double number = 0;
		if (type == 0) {
			String option [] = {"Carats" ,  "Milligrams" , "Centigrams" , "Decigrams" , "Grams" , "Dekagrams" , "Hectograms" , "Kilograms" , "Metric tonnes" , "Ounces" , "Pounds" , "stone" , "Short tones (US)" ,"Long tones (UK)" , "close weight convertor" , "close the unit convertor calculater"};
			for(int x = 0 ; x!=1 ;) {
			try {number = Double.parseDouble((String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, wei , null ,0)); x++;  }
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   one = number;}
		
		if (type == 1) {
			String option [] = {"Micrones" , "Millimeters" , "Centimeters" , "Meters" , "Kilometers" , "Inches" , "Feet" , "yards" , "Miles" , "Nautical Miles"  , "close length convertor" , "close the unit convertor calculater"};
			for(int x = 0 ; x!=1 ;) {
			try {number = Double.parseDouble((String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, len , null ,0)); x++;  }
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   one = number;}
		
		if (type==2) {
			String option [] = {  "Celsius         ===>  Fahrenheit" , "Celsius         ===>  Kelvin" , "Kelvin          ===>  Fahrenheit" , "Kelvin          ===>  Celsius" , "Fahrenheit  ===>  Celsius" , "Fahrenheit  ===>  Kelvin" , "close length convertor" , "close the unit convertor calculater"};
			for(int x = 0 ; x!=1 ;) {
			try {number = Double.parseDouble((String) JOptionPane.showInputDialog(null ,"please enter " + option[koko].substring(0,10) + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, temp , null ,0)); x++;  }
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   one = number;}
		
		if (type==3) {
			String option [] = {  "Seconds" , "Minutes" , "Hours" , "Days" , "Weeks" , "Years"  , "close length convertor" , "close the unit convertor calculater"};
			for(int x = 0 ; x!=1 ;) {
			try {number = Double.parseDouble((String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, time , null ,0)); x++;  }
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   one = number;}
		
		if (type == 4) {
			String option [] = {  "Decimal" , "Hexadecimal" , "Binary" , "Octal" , "close length convertor" , "close the unit convertor calculater"};
			boolean king = true;
			
			if (koko == 0) {
			while(king) {
			try {int i1  = Integer.parseInt((String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, binary , null ,0)); 
			number = 1.0; number = number * i1;     king = false;}
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   
			finaly =   number + "";  black = 1;}
			
			else if (koko == 1) {
			while(king) {
			try {String s1 = (String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, binary , null ,0); 
			s1 = s1.trim();    finaly = s1;
;			int d1 = Integer.parseInt(s1 , 16);
			number = 1.0;  number = number *d1;  king = false;}
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   
			black = 1;}
			
			else if (koko == 2) {
			while(king) {
			try {String s1 = (String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, binary , null ,0); 
			s1 = s1.trim();     finaly = s1 + "";
			int d1 = Integer.parseInt(s1 , 2);
			number = 1.0;  number = number *d1;  king = false;}
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   
			black =1;}
			
			else if (koko == 3) {
			while(king) {
			try {String s1 = (String) JOptionPane.showInputDialog(null ,"please enter " + option[koko] + "\n"+ "please enter a number not string" ,"enter data" , JOptionPane.INFORMATION_MESSAGE, binary , null ,0); 
			s1 = s1.trim();     finaly = s1;
			int d1 = Integer.parseInt(s1 , 8);
			number = 1.0;  number = number *d1;  king = false;}
			catch(Exception e) {JOptionPane.showMessageDialog(null, "please enter a proper input","error", JOptionPane.INFORMATION_MESSAGE ,error);} }   
			black = 1;}
			
			
			
		}
		
			return number;
			
			
	}
	//-------------------------------------------------------------------------------------------------
	public static double dbase(int type , int koko , double base) {                   // from all to base
		
	if     (type==0) {
	if	   (koko==0)  {	base = base /5000;}				else if(koko==1)  {	base = base /1000000;}			else if(koko==2)  {	base = base /100000;}	
	else if(koko==3)  { base = base /10000;}			else if(koko==4)  {	base = base /1000;}				else if(koko==5)  {	base = base /100;}	
	else if(koko==6)  { base = base /10;}				else if(koko==8)  { base = base *1000;}				else if(koko==9)  { base = base /35.2733686067;}
	else if(koko==10) { base = base /2.2046244202;} 	else if(koko==11) { base = base /0.1574730489;}		else if(koko==12) { base = base /0.0011023114;}		
	else if(koko==13) { base = base /0.000984204;} black = 1;}	
	
	if (type == 1) {
	if	   (koko==0)  {	base = base /1000000000;}		else if(koko==1)  {	base = base /1000000;}			else if(koko==2)  {	base = base /100000;}	
	else if(koko==3)  { base = base /1000;}				else if(koko==5)  {	base = base /40000;}			else if(koko==6)  { base = base /3278.68852;}		
	else if(koko==7)  { base = base /1094.091;}			else if(koko==8)  { base = base /0.6213711922;}		else if(koko==9)  { base = base /0.539956;}
	black = 1;}
	
	if (type ==3 ) {
	if	   (koko==0)  {	base = base /3600;}		        else if(koko==1)  {	base = base /60;}			        else if(koko==3)  {	base = base *24;}	
	else if(koko==4)  { base = base *168;}				else if(koko==5)  {	base = base *8766;}				
	black = 1;}
	return base;}
	//----------------------------------------------------------------------------------------------------
	public static double fbase(int type , int fly , double base) {     // from base to all
	
	if(type==0) {
	if	   (fly==0)  {base = base*5000;}				else if(fly==1)  {base = base*1000000;}		  		else if(fly==2)  {base = base*100000;}		
	else if(fly==3)  {base = base*10000;}				else if(fly==4)  {base = base*1000;}				else if(fly==5)  {base = base*100;}					
	else if(fly==6)  {base = base*10;}					else if(fly==8)  {base = base/1000;}				else if(fly==9)  {base = base/0.0283495247;}
	else if(fly==10) {base = base/0.4535922922;}		else if(fly==11) {base = base/6.3502949712;}		else if(fly==12) {base = base/907.4410163339;}		
	else if(fly==13) {base = base/1016.2601626016;} }
	
	if         (type ==1) {
	if	   (fly==0)  {	base = base *1000000000;}		else if(fly==1)  {	base = base *1000000;}			else if(fly==2)  {	base = base *100000;}	
	else if(fly==3)  { base = base *1000;}				else if(fly==5)  {	base = base *40000;}			else if(fly==6)  { base = base *3278.68852;}		
	else if(fly==7)  { base = base *1094.091;}			else if(fly==8)  { base = base *0.6213711922;}		else if(fly==9) { base = base *0.539956;}}
	
	if     (type==2) {
	if	   (fly==0)  {	base = (base * 1.8)+32;}		else if(fly==1)  {	base = base +273.15;}			else if(fly==2)  {	base = 1.8 * (base-273.15) + 32;}	
	else if(fly==3)  {base = base -273.15;}				else if(fly==4)  {  base = (base-32)/1.8;}          else if(fly==5)  {	base = ((base-32)/1.8) +273;}}
	
	if(type ==3) {
	if	   (fly==0)  {	base = base *3600;}		        else if(fly==1)  {	base = base *60;}			        else if(fly==3)  {	base = base /24;}	
	else if(fly==4)  { base = base /168;}				else if(fly==5)  {	base = base /8766;}	}
	
	if (type == 4) {
	int base0 = (int)(base);
	if (fly == 0) {     end = Integer.toString(base0); }
	else if ( fly == 1) {		end = Integer.toHexString(base0).toUpperCase();		}	
	else if ( fly == 2) {		end = Integer.toBinaryString(base0);}
	else if ( fly == 3) {		end = Integer.toOctalString(base0);}
	}
	return base;
	}
	//-----------------------------------------------------------------------------------------------------
	public static void result(double end ) {
		ImageIcon limit = new ImageIcon ("limit.png");
		JOptionPane.showMessageDialog(null, one + " " + name1 + "  ===>  " + end + " " + name2,"result", JOptionPane.INFORMATION_MESSAGE ,limit);}
	//-----------------------------------------------------------------------------------------------------
	public static int length() {
		ImageIcon len = new ImageIcon ("len.png");
		int type = 99; String adv = "";
		String types = "Kilometers";
		String up = "converting length types";
		String option [] = {  "Micrones" , "Millimeters" , "Centimeters" , "Meters" , "Kilometers" , "Inches" , "Feet" , "yards" , "Miles" , "Nautical Miles"  , "close length convertor" , "close the unit convertor calculater"};
		
		if(black ==0) { 
		adv = "please choose what kind of weigth you want convert from:";
		} else if (black ==1 ) {
		adv = "convert " + name1 + " to: ";}
		
		types = (String)JOptionPane.showInputDialog(null , adv , up , 1 ,len , option , option[4] );
		if (types == null) {types= option[11];}		
		type = worker(types,option);
		if(black ==0) { 
		name1 = option[type];
		} else if (black ==1 ) {
		name2 = option[type];}
		black = 0;		return type;}
	//-------------------------------------------------------------------------------------------------------
	public static int temperature() {
		ImageIcon temp = new ImageIcon ("temp.png");
		int type = 99; String adv = "";
		String types = "Kilometers";
		String up = "converting temperature types";
		String option [] = {  "Celsius         ===>     Fahrenheit" , "Celsius         ===>     Kelvin" , "Kelvin          ===>     Fahrenheit" , "Kelvin          ===>     Celsius" , "Fahrenheit  ===>     Celsius" , "Fahrenheit  ===>     Kelvin" , "close length convertor" , "close the unit convertor calculater"};
		types = (String)JOptionPane.showInputDialog(null , adv , up , 1 ,temp , option , option[0] );
		if (types == null) {types= option[7];}		
		type = worker(types,option);
		name1 = types.substring(0,10);
		name1 = name1.trim();
		name2 = types.substring(20);
		name2= name2.trim();
		black = 0;		return type;}
	//---------------------------------------------------------------------------------------------------------
	public static void costum_result(double end) {
		ImageIcon limit = new ImageIcon ("limit.png");
		JOptionPane.showMessageDialog(null, one + " " + name1 + "  ===>  " + end + " " + name2,"result", JOptionPane.INFORMATION_MESSAGE ,limit);}
	//----------------------------------------------------------------------------------------------------------
	public static int time() {
		ImageIcon time = new ImageIcon ("time.png");
		int type = 99; String adv = "";
		String types = "Kilometers";
		String up = "converting timing types";
		String option [] = {  "Seconds" , "Minutes" , "Hours" , "Days" , "Weeks" , "Years"  , "close length convertor" , "close the unit convertor calculater"};
		
		if(black ==0) { 
		adv = "please choose what kind of timing you want convert from:";
		} else if (black ==1 ) {
		adv = "convert " + name1 + " to: ";}
		types = (String)JOptionPane.showInputDialog(null , adv , up , 1 ,time , option , option[2] );
		if (types == null) {types= option[7];}	
		type = worker(types,option);
		if(black ==0) { 
		name1 = option[type];
		} else if (black ==1 ) {
		name2 = option[type];}
		black = 0;		return type;}
	//-----------------------------------------------------------------------------------------------------------
	public static int program() {
		ImageIcon binary = new ImageIcon ("binary.png");
		int type = 99; String adv = "";
		String types = "Kilometers";
		String up = "converting programing types";
		String option [] = {  "Decimal" , "Hexadecimal" , "Binary" , "Octal" , "close length convertor" , "close the unit convertor calculater"};
		
		if(black ==0) { 
		adv = "please choose what kind of timing you want convert from:";
		} else if (black ==1 ) {
		adv = "convert " + name1 + " to: ";}
		types = (String)JOptionPane.showInputDialog(null , adv , up , 1 ,binary , option , option[2] );
		if (types == null) {types= option[5];}	
		type = worker(types,option);
		if(black ==0) { 
		name1 = option[type];
		} else if (black ==1 ) {
		name2 = option[type];}
		black = 0;		return type;}
	//-----------------------------------------------------------------------------------------------------------
	public static void costum2() {
		ImageIcon limit = new ImageIcon ("limit.png");
		
		JOptionPane.showMessageDialog(null, finaly + " " + name1 + "  ===>  " + end + " " + name2,"result", JOptionPane.INFORMATION_MESSAGE ,limit);}
	//--------------------------------------------------------------------------------------------------------------	
}