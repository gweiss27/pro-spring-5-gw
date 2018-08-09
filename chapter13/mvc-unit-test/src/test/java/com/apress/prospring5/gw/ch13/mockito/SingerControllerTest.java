package com.apress.prospring5.gw.ch13.mockito;

import com.apress.prospring5.gw.ch13.SingerController;
import com.apress.prospring5.gw.ch13.entities.Singer;
import com.apress.prospring5.gw.ch13.entities.Singers;
import com.apress.prospring5.gw.ch13.services.SingerService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.ExtendedModelMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public class SingerControllerTest
{
    private final List<Singer> singers = new ArrayList<>();

    @Before
    public void initSingers()
    {
        Singer singer = new Singer();
        singer.setId(1l);
        singer.setFirstName("John");
        singer.setLastName("Mayer");
        singers.add(singer);
    }

    @Test
    public void testList() throws Exception
    {
        SingerService singerService = mock(SingerService.class);
        when(singerService.findAll()).thenReturn(singers);

        SingerController singerController = new SingerController();

        ReflectionTestUtils.setField(singerController, "singerService", singerService);

        ExtendedModelMap uiModel = new ExtendedModelMap();
        uiModel.addAttribute("singers", singerController.listData());

        Singers modelSingers = (Singers) uiModel.get("singers");

        assertEquals(1, modelSingers.getSingers().size());
    }

    @Test
    public void testCreate() throws Exception
    {
        final Singer newSinger = new Singer();
        newSinger.setId(999l);
        newSinger.setFirstName("Stevie");
        newSinger.setLastName("Vaughn");

        SingerService singerService = mock(SingerService.class);
        when(singerService.save(newSinger)).thenAnswer(invocation -> {
            singers.add(newSinger);
            return newSinger;
        });

        SingerController singerController = new SingerController();
        ReflectionTestUtils.setField(singerController, "singerService", singerService);

        Singer singer = singerController.create(newSinger);
        assertEquals(Long.valueOf(999l), newSinger.getId());
        assertEquals("Stevie", newSinger.getFirstName());
        assertEquals("Vaughn", newSinger.getLastName());

        assertEquals(2, singers.size());
    }
}
