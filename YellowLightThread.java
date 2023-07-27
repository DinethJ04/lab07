package com.mycompany.trafficlightsystem;
public class YellowLightThread extends Thread
{
    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                Thread.sleep(15000);
                System.out.println("Yellow Light");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
