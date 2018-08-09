package com.apress.prospring5.gw.ch03.xml;

import com.apress.prospring5.gw.ch03.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class InjectRef
{
    private Oracle oracle;

    public void setOracle(Oracle oracle)
    {
        this.oracle = oracle;
    }

    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
        ctx.close();
    }

    @Override
    public String toString()
    {
        return oracle.defineMeaningOfLife();
    }
}
