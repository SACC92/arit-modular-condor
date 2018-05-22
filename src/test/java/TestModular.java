/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.Modular;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian
 */
public class TestModular {
    
    @Test
    public void TestTabla() {
        int[][] testsuma1 = {{0,1},{1,0}};
        int[][] testprod1 = {{0,0},{0,1}};
        int[][] testsuma2 = {{0,1,2},{1,2,0},{2,0,1}};
        int[][] testprod2 = {{0,0,0},{0,1,2},{0,2,1}};
        int[][] testsuma3 = {{0,1,2,3},{1,2,3,0},{2,3,0,1},{3,0,1,2}};
        int[][] testprod3 = {{0,0,0,0},{0,1,2,3},{0,2,0,2},{0,3,2,1}};
        Assert.assertArrayEquals(testsuma1, Modular.tabla(2, "+"));
        Assert.assertArrayEquals(testprod1, Modular.tabla(2, "*"));
        Assert.assertArrayEquals(testsuma2, Modular.tabla(3, "+"));
        Assert.assertArrayEquals(testprod2, Modular.tabla(3, "*"));
        Assert.assertArrayEquals(testsuma3, Modular.tabla(4, "+"));
        Assert.assertArrayEquals(testprod3, Modular.tabla(4, "*"));
    }
    
    
}
