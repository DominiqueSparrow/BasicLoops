package LoonyLoops;

public class PrintDayInAWord {
public static void main(String[] args) {
	int dayNumber=04;
	String s= "not a valid day, fuck off!-> On the eight day God went to the rave... :0->::D";
	if(dayNumber==1) {
		System.out.println("poniedzia�ek szcz�liwcu");
	}else if(dayNumber==2){
		System.out.println("wtorek, juz po poniedzia�ku");
	}else if(dayNumber==3){
		System.out.println( "�roda- ma�y pi�tek");
	}else if(dayNumber==4){
		System.out.println( "czwartek");
	}else if(dayNumber==5){
		System.out.println( "pi�-�-�-tuuunioooo!");
	}else if(dayNumber==6){
		System.out.println( "sobota?");
	}else if(dayNumber==7){
		System.out.println ("chlip.. ");
	}else if(dayNumber>=8){
		System.out.println(s);
	}
	//end a series of "if(s)"
	//switch-case-default
//	for (int i; (i);i++) {
	switch(dayNumber) {
	case 1:System.out.println(" poniedzia�ek szcz�liwcu- switch sie wydrukowal");break;
	case 2:System.out.println(" wtorek, juz po poniedzia�ku ");break;
	case 3:System.out.println(" czwartek - tak naprawde �roda");break;
	case 4:System.out.println("pi�-�-�-tuuunioooo!-czwartek ");break;
	case 5:System.out.println("�roda- ma�y pi�tek- no wiadomo");break;
	case 6:System.out.println(" sobota?");break;
	case 7:System.out.println(" si�dmy dzie� ");break;
	default: System.out.println("On the first day of darkness God created space. \r\n"
			+ "And on the second day God created Earth. And on the third day god created sound. \r\n"
			+ "And on the fourth day god created light. And on the fifth day god created drums. \r\n"
			+ "And on the sixth day god created bass. And on the seventh day god created melodys. \r\n"
			+ "And on the eighth day god created THE MASTERS OF RAVE!\""); break;
	}//end switch
	// }//end forLoop
}//endMain
}//endClass
