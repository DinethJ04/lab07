package com.mycompany.trafficlightsystem;
public class GreenLightThread extends Thread
{
    @Override
    public void run() 
    {
        try 
        {
            while (true) 
            {
                Thread.sleep(5000); 
                System.out.println("Green light");
                Thread.sleep(10000);
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
