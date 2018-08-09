package com.apress.prospring5.gw.ch02;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class HelloWorldWithCommandLine
{
    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            System.out.println(args[0]);
        }
        else
        {
            System.out.println("Hello World!");
        }
    }
}
