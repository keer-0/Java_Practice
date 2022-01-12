/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class TwelveDays{
    String verse(int verseNumber){
        String ver="";
        if(verseNumber==1)
            ver="On the first day of Christmas my true love gave to me: " +"a Partridge in a Pear Tree.\n";
        else if(verseNumber==2)
            ver="On the second day of Christmas my true love gave to me: two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
        else if(verseNumber==3)
            ver="On the third day of Christmas my true love gave to me: three French Hens, " +"two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==4)
            ver="On the fourth day of Christmas my true love gave to me: four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==5)
            ver="On the fifth day of Christmas my true love gave to me: five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==6)
            ver="On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        else if(verseNumber==7)
            ver="On the seventh day of Christmas my true love gave to me: " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +"two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==8)
            ver="On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +" seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==9)
            ver="On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +"eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    
        else if(verseNumber==10)
            ver="On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +"nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +"five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
    
        else if(verseNumber==11)
            ver="On the eleventh day of Christmas my true love gave to me: " +"eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    
        else if(verseNumber==12)
            ver="On the twelfth day of Christmas my true love gave to me: " +"twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +"eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    
        return ver;
    }
    
    String verses(int startVerse, int endVerse){
        String vers="";
            for(int i=startVerse;i<=endVerse;i++){
                if(i<endVerse)
                    vers=vers+verse(i)+"\n";
                else
                    vers=vers+verse(i);
            }
            return vers;
    }
    
    String song()
    {
        return verses(1,12);
    }
    
}

public class Main
{
	public static void main(String[] args) {
		TwelveDays twelve =new TwelveDays();
		System.out.println(twelve.song());
	}
}
