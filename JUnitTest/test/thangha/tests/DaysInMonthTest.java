/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangha.tests;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import thangha.function.DaysInMonth;

/**
 *
 * @author Admin
 */
public class DaysInMonthTest {
    
    public DaysInMonthTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void DIM001() {
        short year = 2020;
        byte month = 1;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM002() {
        short year = 2020;
        byte month = 2;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 29;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM003() {
        short year = 2020;
        byte month = 3;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM004() {
        short year = 2020;
        byte month = 4;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM005() {
        short year = 2020;
        byte month = 5;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM006() {
        short year = 2020;
        byte month = 6;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM007() {
        short year = 2020;
        byte month = 7;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM008() {
        short year = 2020;
        byte month = 8;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM009() {
        short year = 2020;
        byte month = 9;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM010() {
        short year = 2020;
        byte month = 10;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM011() {
        short year = 2020;
        byte month = 11;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM012() {
        short year = 2020;
        byte month = 12;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM013() {
        short year = 2019;
        byte month = 1;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM014() {
        short year = 2019;
        byte month = 2;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 28;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM015() {
        short year = 2019;
        byte month = 3;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM016() {
        short year = 2019;
        byte month = 4;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM017() {
        short year = 2019;
        byte month = 5;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM018() {
        short year = 2019;
        byte month = 6;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM019() {
        short year = 2019;
        byte month = 7;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM020() {
        short year = 2019;
        byte month = 8;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM021() {
        short year = 2019;
        byte month = 9;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM022() {
        short year = 2019;
        byte month = 10;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM023() {
        short year = 2019;
        byte month = 11;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM024() {
        short year = 2019;
        byte month = 12;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM025() {
        short year = 2100;
        byte month = 1;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM026() {
        short year = 2100;
        byte month = 2;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 28;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM027() {
        short year = 2100;
        byte month = 3;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM028() {
        short year = 2100;
        byte month = 4;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM029() {
        short year = 2100;
        byte month = 5;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM030() {
        short year = 2100;
        byte month = 6;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM031() {
        short year = 2100;
        byte month = 7;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM032() {
        short year = 2100;
        byte month = 8;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM033() {
        short year = 2100;
        byte month = 9;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM034() {
        short year = 2100;
        byte month = 10;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM035() {
        short year = 2100;
        byte month = 11;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 30;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void DIM036() {
        short year = 2100;
        byte month = 12;
        DaysInMonth daysInMonth = new DaysInMonth();
        byte expResult = 31;
        byte result = daysInMonth.DaysInMonth(year, month);
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
