package com.mycompany.trafficlightsystem;
public class TrafficLightSystem 
{
    public static void main(String[] args) 
    {
        RedLightThread redThread = new RedLightThread();
        GreenLightThread greenThread = new GreenLightThread();
        YellowLightThread yellowThread = new YellowLightThread();

        redThread.start();
        greenThread.start();
        yellowThread.start();

        try 
        {
            while (true) 
            {
                Thread.sleep(20000); 
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
