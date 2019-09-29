package LoonyLoops;

public class PrintNumberInWord {
public static void main (String[]args) {
int number=10;
String s= "bogactwo";
if(number==1) {
	System.out.println("jeden unus!");
}else if(number==2){
	System.out.println("dwa duo!");
}else if(number==3){
	System.out.println( "twoj dzisiejszy szczeœliwy numer to "+ number+ ", tres!");
}else if(number==4){
	System.out.println( number+ " quattuor!");
}else if(number==5){
	System.out.println( number+ " quinque!");
}else if(number==6){
	System.out.println( number+ " sex!");
}else if(number==7){
	System.out.println (number+ " septem!");
}else if(number==8){
	System.out.println( number+ " octo!");
}else if(number==9){
	System.out.println( number+ " novem!");
}else if(number==10){
	System.out.println( s+ " decem!");
}//end a series of "if(s)"
//switch-case-default
switch(number) {
case 1:System.out.println(" jedyneczka !");break;
case 2:System.out.println(" dwója !");break;
case 3:System.out.println(" trinity !");break;
case 4:System.out.println(" czwóra !");break;
case 5:System.out.println(" piatunia !");break;
case 6:System.out.println(" szósteczka !");break;
case 7:System.out.println(" siedem !");break;
case 8:System.out.println(" ³osiem !");break;
case 9:System.out.println(" dziwienæ !");break;
case 10:System.out.println(" bravo ! normalnie brawo!");break;
}//end switch
	
}//end main
}//endClass
