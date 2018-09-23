/**
 *
 * @author Danny
 */
import java.util.Random;
public class BSGame 
{
    public void AISpawn()
    {
        
    }
    
    /*
    
    */
    public String AIpegSelect()
    {
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        int numLetter = rand.nextInt(10) + 1;
        String letter = letterSelect(numLetter);
        String numToStr = Integer.toString(num);
        return letter + numToStr;
    }
    
    public double AIpegReturn(String peg)
    {
        return letterSort(peg) + numSort(peg);
    }
    
    private double letterSort(String peg)
    {
        double AIpeg = 0.0;
        
        if (peg.charAt(0) == "A".charAt(0))
        {
            AIpeg = 0.0;     
        }
        else if (peg.charAt(0) == "B".charAt(0))
        {
            AIpeg = 1.0;
        }
        else if (peg.charAt(0) == "C".charAt(0))
        {
            AIpeg = 2.0;
        }
        else if (peg.charAt(0) == "D".charAt(0))
        {
            AIpeg = 3.0;
        }
        else if (peg.charAt(0) == "E".charAt(0))
        {
            AIpeg = 4.0;
        }
        else if (peg.charAt(0) == "F".charAt(0))
        {
            AIpeg = 5.0;
        }
        else if (peg.charAt(0) == "G".charAt(0))
        {
            AIpeg = 6.0;
        }
        else if (peg.charAt(0) == "H".charAt(0))
        {
            AIpeg = 7.0;
        }
        else if (peg.charAt(0) == "I".charAt(0))
        {
            AIpeg = 8.0;
        }
        else if (peg.charAt(0) == "J".charAt(0))
        {
            AIpeg = 9.0;
        }
        return AIpeg;
    }
    
    private double numSort(String peg)
    {
        double AIpeg = 0.0;
        
        if (peg.charAt(1) == "1".charAt(0))
        {
            AIpeg = 0.0;     
        }
        else if (peg.charAt(1) == "2".charAt(0))
        {
            AIpeg = 0.1;
        }
        else if (peg.charAt(1) == "3".charAt(0))
        {
            AIpeg = 0.2;
        }
        else if (peg.charAt(1) == "4".charAt(0))
        {
            AIpeg = 0.3;
        }
        else if (peg.charAt(1) == "5".charAt(0))
        {
            AIpeg = 0.4;
        }
        else if (peg.charAt(1) == "6".charAt(0))
        {
            AIpeg = 0.5;
        }
        else if (peg.charAt(1) == "7".charAt(0))
        {
            AIpeg = 0.6;
        }
        else if (peg.charAt(1) == "8".charAt(0))
        {
            AIpeg = 0.7;
        }
        else if (peg.charAt(1) == "9".charAt(0))
        {
            AIpeg = 0.8;
        }
        else if (peg.charAt(2) == "0".charAt(0))
        {
            AIpeg = 0.9;
        }
        return AIpeg;
    }
    
    private String letterSelect(int num)
    {
        String letterTBR;
        switch(num)
        {
            case 1:
                letterTBR = "A";
                break;
            case 2:
                letterTBR = "B";
                break;
            case 3:
                letterTBR = "C";
                break;
            case 4:
                letterTBR = "D";
                break;
            case 5:
                letterTBR = "E";
                break;
            case 6:
                letterTBR = "F";
                break;
            case 7:
                letterTBR = "G";
                break;
            case 8:
                letterTBR = "H";
                break;
            case 9:
                letterTBR = "I";
                break;
            case 10:
                letterTBR = "J";
                break;
            default:
                letterTBR = null;
                
        }
        return letterTBR;
    }
}
