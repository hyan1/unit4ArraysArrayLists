import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     * 1. create radar object
     * 2. set monster location
     * 3. invoice scan a bunch
     * 4. analyze accumulator(via accumulateddetection to dind row+col of detected monster)
     * 5. assertEquals(expectedrow, detectedrow)
     *    assertEquals(expectedcol, detectedcol)
     */
    public RadarTest()
    {
        // initialise instance variables
    }
    
    /**
     * first test 
     * test the monster if it's at specific location
     */
    @Test
    public void test1()
    {
        //1
        Radar radar = new Radar(100, 100);
       
        
        //2
        radar.setMonsterLocation(23, 6);
        radar.setNoiseFraction(0.10);
         
        //3
        for(int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        //4
        int row = 0;
        int col = 0;
        int m = 0;
        
        for(int k = 0; k < 100; k++)
        {
            for(int j = 0; j < 100; j++)
            {
                if(radar.getAccumulatedDetection(k, j) > m)
                {
                    m = radar.getAccumulatedDetection(k, j);
                    row = k;
                    col = j;
                }
            }
        }
        
        //5
        assertEquals(23, row);
        assertEquals(6, col);
    }

    /**
     * second test
     * test the monster if it's at specific location
     */
    @Test
    public void test2()
    {
        //1
        Radar radar = new Radar(100, 100);
        
        //2
        radar.setMonsterLocation(6, 23);
        radar.setNoiseFraction(0.10);
        
        //3
        for(int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        //4
        int row = 0;
        int col = 0;
        int m = 0;
        for(int k = 0; k < 100; k++)
        {
            for(int j = 0; j < 100; j++)
            {
                if(radar.getAccumulatedDetection(k, j) > m)
                {
                    m = radar.getAccumulatedDetection(k, j);
                    row = k;
                    col = j;
                }
            }
        }
        
        //5
        assertEquals(6, row);
        assertEquals(23, col);
    }


}
