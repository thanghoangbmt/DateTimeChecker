/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangha.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import thangha.function.IsValidDate;

/**
 *
 * @author Admin
 */
public class IsValidDateTest {

    public IsValidDateTest() {
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
    public void IVD001() {
        byte day = 0;
        byte month = 1;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD002() {
        byte day = 29;
        byte month = 1;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD003() {
        byte day = 30;
        byte month = 1;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD004() {
        byte day = 31;
        byte month = 1;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD005() {
        byte day = 32;
        byte month = 1;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD006() {
        byte day = 0;
        byte month = 2;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD007() {
        byte day = 29;
        byte month = 2;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD008() {
        byte day = 30;
        byte month = 2;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD009() {
        byte day = 31;
        byte month = 2;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD010() {
        byte day = 32;
        byte month = 2;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD011() {
        byte day = 0;
        byte month = 3;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD012() {
        byte day = 29;
        byte month = 3;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD013() {
        byte day = 30;
        byte month = 3;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD014() {
        byte day = 31;
        byte month = 3;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD015() {
        byte day = 32;
        byte month = 3;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD016() {
        byte day = 0;
        byte month = 4;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD017() {
        byte day = 29;
        byte month = 4;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD018() {
        byte day = 30;
        byte month = 4;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD019() {
        byte day = 31;
        byte month = 4;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD020() {
        byte day = 32;
        byte month = 4;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD021() {
        byte day = 0;
        byte month = 5;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD022() {
        byte day = 29;
        byte month = 5;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD023() {
        byte day = 30;
        byte month = 5;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD024() {
        byte day = 31;
        byte month = 5;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD025() {
        byte day = 32;
        byte month = 5;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD026() {
        byte day = 0;
        byte month = 6;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD027() {
        byte day = 29;
        byte month = 6;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD028() {
        byte day = 30;
        byte month = 6;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD029() {
        byte day = 31;
        byte month = 6;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD030() {
        byte day = 32;
        byte month = 6;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD031() {
        byte day = 0;
        byte month = 7;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD032() {
        byte day = 29;
        byte month = 7;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD033() {
        byte day = 30;
        byte month = 7;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD034() {
        byte day = 31;
        byte month = 7;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD035() {
        byte day = 32;
        byte month = 7;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD036() {
        byte day = 0;
        byte month = 8;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD037() {
        byte day = 29;
        byte month = 8;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD038() {
        byte day = 30;
        byte month = 8;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD039() {
        byte day = 31;
        byte month = 8;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD040() {
        byte day = 32;
        byte month = 8;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD041() {
        byte day = 0;
        byte month = 9;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD042() {
        byte day = 29;
        byte month = 9;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD043() {
        byte day = 30;
        byte month = 9;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD044() {
        byte day = 31;
        byte month = 9;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD045() {
        byte day = 32;
        byte month = 9;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD046() {
        byte day = 0;
        byte month = 10;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD047() {
        byte day = 29;
        byte month = 10;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD048() {
        byte day = 30;
        byte month = 10;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD049() {
        byte day = 31;
        byte month = 10;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD050() {
        byte day = 32;
        byte month = 10;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD051() {
        byte day = 0;
        byte month = 11;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD052() {
        byte day = 29;
        byte month = 11;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD053() {
        byte day = 30;
        byte month = 11;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD054() {
        byte day = 31;
        byte month = 11;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD055() {
        byte day = 32;
        byte month = 11;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD056() {
        byte day = 0;
        byte month = 12;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD057() {
        byte day = 29;
        byte month = 12;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD058() {
        byte day = 30;
        byte month = 12;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD059() {
        byte day = 31;
        byte month = 12;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD060() {
        byte day = 32;
        byte month = 12;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD061() {
        byte day = 0;
        byte month = 13;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD062() {
        byte day = 29;
        byte month = 13;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD063() {
        byte day = 30;
        byte month = 13;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD064() {
        byte day = 31;
        byte month = 13;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD065() {
        byte day = 32;
        byte month = 13;
        short year = 2019;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD066() {
        byte day = 0;
        byte month = 1;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD067() {
        byte day = 29;
        byte month = 1;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD068() {
        byte day = 30;
        byte month = 1;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD069() {
        byte day = 31;
        byte month = 1;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD070() {
        byte day = 32;
        byte month = 1;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD071() {
        byte day = 0;
        byte month = 2;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD072() {
        byte day = 29;
        byte month = 2;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD073() {
        byte day = 30;
        byte month = 2;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD074() {
        byte day = 31;
        byte month = 2;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD075() {
        byte day = 32;
        byte month = 2;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD076() {
        byte day = 0;
        byte month = 3;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD077() {
        byte day = 29;
        byte month = 3;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD078() {
        byte day = 30;
        byte month = 3;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD079() {
        byte day = 31;
        byte month = 3;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD080() {
        byte day = 32;
        byte month = 3;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD081() {
        byte day = 0;
        byte month = 4;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD082() {
        byte day = 29;
        byte month = 4;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD083() {
        byte day = 30;
        byte month = 4;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD084() {
        byte day = 31;
        byte month = 4;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD085() {
        byte day = 32;
        byte month = 4;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD086() {
        byte day = 0;
        byte month = 5;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD087() {
        byte day = 29;
        byte month = 5;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD088() {
        byte day = 30;
        byte month = 5;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD089() {
        byte day = 31;
        byte month = 5;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD090() {
        byte day = 32;
        byte month = 5;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD091() {
        byte day = 0;
        byte month = 6;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD092() {
        byte day = 29;
        byte month = 6;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD093() {
        byte day = 30;
        byte month = 6;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD094() {
        byte day = 31;
        byte month = 6;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD095() {
        byte day = 32;
        byte month = 6;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD096() {
        byte day = 0;
        byte month = 7;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD097() {
        byte day = 29;
        byte month = 7;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD098() {
        byte day = 30;
        byte month = 7;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD099() {
        byte day = 31;
        byte month = 7;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD100() {
        byte day = 32;
        byte month = 7;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD0101() {
        byte day = 0;
        byte month = 8;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD102() {
        byte day = 29;
        byte month = 8;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD103() {
        byte day = 30;
        byte month = 8;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD104() {
        byte day = 31;
        byte month = 8;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD105() {
        byte day = 32;
        byte month = 8;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD106() {
        byte day = 0;
        byte month = 9;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD107() {
        byte day = 29;
        byte month = 9;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD108() {
        byte day = 30;
        byte month = 9;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD109() {
        byte day = 31;
        byte month = 9;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD110() {
        byte day = 32;
        byte month = 9;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD111() {
        byte day = 0;
        byte month = 10;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD112() {
        byte day = 29;
        byte month = 10;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD113() {
        byte day = 30;
        byte month = 10;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD114() {
        byte day = 31;
        byte month = 10;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD115() {
        byte day = 32;
        byte month = 10;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD116() {
        byte day = 0;
        byte month = 11;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD117() {
        byte day = 29;
        byte month = 11;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD118() {
        byte day = 30;
        byte month = 11;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD119() {
        byte day = 31;
        byte month = 11;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD120() {
        byte day = 32;
        byte month = 11;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD121() {
        byte day = 0;
        byte month = 12;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD122() {
        byte day = 29;
        byte month = 12;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD123() {
        byte day = 30;
        byte month = 12;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD124() {
        byte day = 31;
        byte month = 12;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD125() {
        byte day = 32;
        byte month = 12;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD126() {
        byte day = 0;
        byte month = 13;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD127() {
        byte day = 29;
        byte month = 13;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD128() {
        byte day = 30;
        byte month = 13;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD129() {
        byte day = 31;
        byte month = 13;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD130() {
        byte day = 32;
        byte month = 13;
        short year = 2020;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD131() {
        byte day = 0;
        byte month = 2;
        short year = 2000;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD132() {
        byte day = 29;
        byte month = 2;
        short year = 2000;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = true;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD133() {
        byte day = 30;
        byte month = 2;
        short year = 2000;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD134() {
        byte day = 31;
        byte month = 2;
        short year = 2000;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD135() {
        byte day = 32;
        byte month = 2;
        short year = 2000;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD136() {
        byte day = 0;
        byte month = 2;
        short year = 2100;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD137() {
        byte day = 29;
        byte month = 2;
        short year = 2100;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD138() {
        byte day = 30;
        byte month = 2;
        short year = 2100;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD139() {
        byte day = 31;
        byte month = 2;
        short year = 2100;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void IVD140() {
        byte day = 32;
        byte month = 2;
        short year = 2100;
        IsValidDate isValidDate = new IsValidDate();
        boolean expResult = false;
        boolean result = isValidDate.IsValidDate(day, month, year);
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
