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
        int[][] test = {{0,1,2},{1,2,0},{2,0,1}};
        Assert.assertArrayEquals(test, Modular.tabla(3, "+"));
    }
    
    
}
